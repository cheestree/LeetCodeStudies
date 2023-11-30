package powxn

import kotlin.test.Test
import kotlin.test.assertEquals

class PowxnTest {
    @Test
    fun myPow1(){
        val x = 2.00000
        val n = 10
        val output = myPow(x, n)
        val correctOutput = 1024.00000
        assertEquals(correctOutput, output)
    }

    @Test
    fun myPow2(){
        val x = 2.10000
        val n = 3
        val output = myPow(x, n)
        val correctOutput = 9.26100
        assertEquals(correctOutput, output)
    }

    @Test
    fun myPow3(){
        val x = 2.00000
        val n = -2
        val output = myPow(x, n)
        val correctOutput = 0.25000
        assertEquals(correctOutput, output)
    }

    @Test
    fun myPow4(){
        val x = 0.44894
        val n = -5
        val output = myPow(x, n)
        val correctOutput = 54.83508
        assertEquals(correctOutput, output)
    }
}