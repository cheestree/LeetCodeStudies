package medium.divideTwoIntegers

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DivideTwoIntegersTest {
    @Test
    fun divide1(){
        val dividend = 10
        val divisor = 3
        val output = divide(dividend, divisor)
        val correctOutput = 3
        assertEquals(correctOutput, output)
    }

    @Test
    fun divide2(){
        val dividend = 7
        val divisor = -3
        val output = divide(dividend, divisor)
        val correctOutput = -2
        assertEquals(correctOutput, output)
    }
}