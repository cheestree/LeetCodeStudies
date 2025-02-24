package easy.palindromeNumber

import easy.palindromeNumber.isPalindrome
import kotlin.test.Test
import kotlin.test.assertEquals

class PalindromeNumberTest {
    @Test
    fun palindromeNumber1(){
        val str = 121
        val output = isPalindrome(str)
        val correctOutput = true
        assertEquals(correctOutput, output)
    }

    @Test
    fun palindromeNumber2(){
        val str = -121
        val output = isPalindrome(str)
        val correctOutput = false
        assertEquals(correctOutput, output)
    }

    @Test
    fun palindromeNumber3(){
        val str = 10
        val output = isPalindrome(str)
        val correctOutput = false
        assertEquals(correctOutput, output)
    }
}
