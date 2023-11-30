package zigZagConversion

import medium.zigZagConversion.convert
import kotlin.test.Test
import kotlin.test.assertEquals

class ZigZagConversionTest {
    @Test
    fun zigZagConversion1(){
        val str = "PAYPALISHIRING"
        val numRows = 3
        val output = convert(str, numRows)
        val correctOutput = "PAHNAPLSIIGYIR"
        assertEquals(correctOutput, output)
    }

    @Test
    fun zigZagConversion2(){
        val str = "PAYPALISHIRING"
        val numRows = 4
        val output = convert(str, numRows)
        val correctOutput = "PINALSIGYAHRPI"
        assertEquals(correctOutput, output)
    }

    @Test
    fun zigZagConversion3(){
        val str = "A"
        val numRows = 1
        val output = convert(str, numRows)
        val correctOutput = "A"
        assertEquals(correctOutput, output)
    }
}