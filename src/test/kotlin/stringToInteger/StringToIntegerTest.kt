package stringToInteger

import palindromeNumber.isPalindrome
import kotlin.test.Test
import kotlin.test.assertEquals

class StringToIntegerTest {
    @Test
    fun myAtoi1(){
        val str = "42"
        val output = myAtoi(str)
        val correctOutput = 42
        assertEquals(correctOutput, output)
    }

    @Test
    fun myAtoi2(){
        val str = "   -42"
        val output = myAtoi(str)
        val correctOutput = -42
        assertEquals(correctOutput, output)
    }

    @Test
    fun myAtoi3(){
        val str = "4193 with words"
        val output = myAtoi(str)
        val correctOutput = 4193
        assertEquals(correctOutput, output)
    }

    @Test
    fun myAtoi4(){
        val str = "words and 987"
        val output = myAtoi(str)
        val correctOutput = 0
        assertEquals(correctOutput, output)
    }

    @Test
    fun myAtoi5(){
        val str = "-91283472332"
        val output = myAtoi(str)
        val correctOutput = -2147483648
        assertEquals(correctOutput, output)
    }
}