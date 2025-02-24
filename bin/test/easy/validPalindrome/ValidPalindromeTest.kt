package easy.validPalindrome

import kotlin.test.Test
import kotlin.test.assertEquals

class ValidPalindromeTest {
    @Test
    fun isPalindrome1(){
        val str = "A man, a plan, a canal: Panama"
        val output = isPalindrome(str)
        val correctOutput = true
        assertEquals(correctOutput, output)
    }

    @Test
    fun isPalindrome2(){
        val str = "race a car"
        val output = isPalindrome(str)
        val correctOutput = false
        assertEquals(correctOutput, output)
    }

    @Test
    fun isPalindrome3(){
        val str = " "
        val output = isPalindrome(str)
        val correctOutput = true
        assertEquals(correctOutput, output)
    }

    @Test
    fun isPalindrome4(){
        val str = "0P"
        val output = isPalindrome(str)
        val correctOutput = false
        assertEquals(correctOutput, output)
    }
}