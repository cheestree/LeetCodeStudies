package medium.rearrangeElementsBySign

import medium.rearrangelementsbysign.rearrangeArray
import kotlin.test.Test
import kotlin.test.assertEquals

class RearrangeElementsBySignTest {
    @Test
    fun rearrangeArray1(){
        val x = intArrayOf(3,1,-2,-5,2,-4)
        val output = rearrangeArray(x)
        val correctOutput = intArrayOf(3,-2,1,-5,2,-4)
        assertEquals(correctOutput, output)
    }

    @Test
    fun rearrangeArray2(){
        val x = intArrayOf(-1,1)
        val output = rearrangeArray(x)
        val correctOutput = intArrayOf(1,-1)
        assertEquals(correctOutput, output)
    }
}