package easy.removeLetterToEqualizeFrequency

import kotlin.test.Test
import kotlin.test.assertEquals

class RemoveLetterToEqualizeFrequencyTest {
    @Test
    fun removeLetterToEqualizeFrequency1(){
        val word = "abcc"
        val output = equalFrequency(word)
        val correctOutput = true
        assertEquals(correctOutput, output)
    }

    @Test
    fun removeLetterToEqualizeFrequency2(){
        val word = "aazz"
        val output = equalFrequency(word)
        val correctOutput = false
        assertEquals(correctOutput, output)
    }
}