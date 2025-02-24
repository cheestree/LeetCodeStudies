package medium.integerToRoman

import kotlin.test.Test
import kotlin.test.assertEquals

class IntegerToRomanTest {
    @Test
    fun intToRoman1(){
        val num = 3
        val output = intToRoman(num)
        val correctOutput = "III"
        assertEquals(correctOutput, output)
    }

    @Test
    fun intToRoman2(){
        val num = 58
        val output = intToRoman(num)
        val correctOutput = "LVIII"
        assertEquals(correctOutput, output)
    }

    @Test
    fun intToRoman3(){
        val num = 1994
        val output = intToRoman(num)
        val correctOutput = "MCMXCIV"
        assertEquals(correctOutput, output)
    }

    @Test
    fun intToRoman4(){
        val num = 1
        val output = intToRoman(num)
        val correctOutput = "I"
        assertEquals(correctOutput, output)
    }
}