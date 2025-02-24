package medium.findFirstLastPositionElementInArray

import kotlin.test.Test
import kotlin.test.assertContentEquals

class FindFirstLastPositionElementInArrayTest {
    @Test
    fun findFirstLastPositionElementInArray1(){
        val nums = intArrayOf(5,7,7,8,8,10)
        val target  = 8
        val output = searchRange(nums, target)
        val correctOutput = intArrayOf(3,4)
        assertContentEquals(correctOutput, output)
    }

    @Test
    fun findFirstLastPositionElementInArray2(){
        val nums = intArrayOf(5,7,7,8,8,10)
        val target  = 6
        val output = searchRange(nums, target)
        val correctOutput = intArrayOf(-1,-1)
        assertContentEquals(correctOutput, output)
    }

    @Test
    fun findFirstLastPositionElementInArray3(){
        val nums = intArrayOf()
        val target  = 0
        val output = searchRange(nums, target)
        val correctOutput = intArrayOf(-1,-1)
        assertContentEquals(correctOutput, output)
    }
}