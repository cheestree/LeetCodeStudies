package plusOne

import palindromeNumber.isPalindrome
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class PlusOneTest {
    @Test
    fun plusOne1(){
        val arr = intArrayOf(1,2,3)
        val output = plusOne(arr)
        val correctOutput = intArrayOf(1,2,4)
        assertContentEquals(correctOutput, output)
    }

    @Test
    fun plusOne2(){
        val arr = intArrayOf(4,3,2,1)
        val output = plusOne(arr)
        val correctOutput = intArrayOf(4,3,2,2)
        assertContentEquals(correctOutput, output)
    }

    @Test
    fun plusOne3(){
        val arr = intArrayOf(9)
        val output = plusOne(arr)
        val correctOutput = intArrayOf(1,0)
        assertContentEquals(correctOutput, output)
    }

    @Test
    fun plusOne4(){
        val arr = intArrayOf(6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3)
        val output = plusOne(arr)
        val correctOutput = intArrayOf(6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,4)
        assertContentEquals(correctOutput, output)
    }
}