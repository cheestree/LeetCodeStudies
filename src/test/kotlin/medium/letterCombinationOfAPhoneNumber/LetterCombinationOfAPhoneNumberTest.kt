package medium.letterCombinationOfAPhoneNumber

import kotlin.test.Test
import kotlin.test.assertEquals

class LetterCombinationOfAPhoneNumberTest {
    @Test
    fun letterCombinationOfAPhoneNumber1(){
        val num = "23"
        val output = letterCombinations(num)
        val correctOutput = listOf("ad","ae","af","bd","be","bf","cd","ce","cf")
        assertEquals(correctOutput, output)
    }

    @Test
    fun letterCombinationOfAPhoneNumber2(){
        val num = ""
        val output = letterCombinations(num)
        val correctOutput = listOf<String>()
        assertEquals(correctOutput, output)
    }

    @Test
    fun letterCombinationOfAPhoneNumber3(){
        val num = "2"
        val output = letterCombinations(num)
        val correctOutput = listOf("a","b","c")
        assertEquals(correctOutput, output)
    }
}