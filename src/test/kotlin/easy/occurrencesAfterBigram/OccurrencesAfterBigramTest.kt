package occurrencesAfterBigram

import easy.occurrencesAfterBigram.findOcurrences
import kotlin.test.Test
import kotlin.test.assertContentEquals

class OccurrencesAfterBigramTest {
    @Test
    fun occurrencesAfterBigram1(){
        val arr = "alice is a good girl she is a good student"
        val first = "a"
        val second = "good"
        val output = findOcurrences(arr, first, second)
        val correctOutput = arrayOf("girl","student")
        assertContentEquals(correctOutput,output)
    }

    @Test
    fun occurrencesAfterBigram2(){
        val arr = "we will we will rock you"
        val first = "we"
        val second = "will"
        val output = findOcurrences(arr, first, second)
        val correctOutput = arrayOf("we","rock")
        assertContentEquals(correctOutput, output)
    }

    @Test
    fun occurrencesAfterBigram3(){
        val arr = "jkypmsxd jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa kcyxdfnoa jkypmsxd kcyxdfnoa"
        val first = "kcyxdfnoa"
        val second = "jkypmsxd"
        val output = findOcurrences(arr, first, second)
        val correctOutput = arrayOf("kcyxdfnoa", "kcyxdfnoa", "kcyxdfnoa")
        assertContentEquals(correctOutput, output)
    }
}