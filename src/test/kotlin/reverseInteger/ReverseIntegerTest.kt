package reverseInteger

import kotlin.test.Test
import kotlin.test.assertEquals

class ReverseIntegerTest {
    @Test
    fun reverse1(){
        val str = 123
        val output = reverse(str)
        val correctOutput = 321
        assertEquals(correctOutput, output)
    }

    @Test
    fun reverse2(){
        val str = -123
        val output = reverse(str)
        val correctOutput = -321
        assertEquals(correctOutput, output)
    }

    @Test
    fun reverse3(){
        val str = 120
        val output = reverse(str)
        val correctOutput = 21
        assertEquals(correctOutput, output)
    }
}