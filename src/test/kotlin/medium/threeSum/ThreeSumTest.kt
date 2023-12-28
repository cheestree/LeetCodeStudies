package medium.threeSum

import kotlin.test.Test
import kotlin.test.assertEquals

class ThreeSumTest {
    @Test
    fun threeSum1(){
        val nums = intArrayOf(-1,0,1,2,-1,-4)
        val output = threeSum(nums)
        val correctOutput = listOf(listOf(-1,-1,2), listOf(-1,0,1))
        assertEquals(correctOutput, output)
    }

    @Test
    fun threeSum2(){
        val nums = intArrayOf(0,1,1)
        val output = threeSum(nums)
        val correctOutput = listOf<List<Int>>()
        assertEquals(correctOutput, output)
    }

    @Test
    fun threeSum3(){
        val nums = intArrayOf(0,0,0)
        val output = threeSum(nums)
        val correctOutput = listOf(listOf(0, 0, 0))
        assertEquals(correctOutput, output)
    }
}