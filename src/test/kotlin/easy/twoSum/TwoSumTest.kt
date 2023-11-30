package twoSum

import easy.twoSum.twoSum
import kotlin.test.Test
import kotlin.test.assertContentEquals

class TwoSumTest{
    @Test
    fun twoSum1(){
        val arr = intArrayOf(2,7,11,15)
        val target = 9
        val output = twoSum(arr, target)
        val correctOutput = intArrayOf(0, 1)
        assertContentEquals(correctOutput,output)
    }

    @Test
    fun twoSum2(){
        val arr = intArrayOf(3,2,4)
        val target = 6
        val output = twoSum(arr, target)
        val correctOutput = intArrayOf(1, 2)
        assertContentEquals(correctOutput, output)
    }

    @Test
    fun twoSum3(){
        val arr = intArrayOf(3,3)
        val target = 6
        val output = twoSum(arr, target)
        val correctOutput = intArrayOf(0, 1)
        assertContentEquals(correctOutput, output)
    }
}