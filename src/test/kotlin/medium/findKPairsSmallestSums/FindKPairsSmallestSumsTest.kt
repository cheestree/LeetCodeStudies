package medium.findKPairsSmallestSums

import kotlin.test.Test
import kotlin.test.assertContentEquals

class FindKPairsSmallestSumsTest {
    @Test
    fun kSmallestPairs1(){
        val nums1 = intArrayOf(1,7,11)
        val nums2 = intArrayOf(2,4,6)
        val k = 3
        val output = kSmallestPairs(nums1, nums2, k)
        val correctOutput = listOf(listOf(1,2), listOf(1,4), listOf(1,6))
        assertContentEquals(correctOutput, output)
    }

    @Test
    fun kSmallestPairs2(){
        val nums1 = intArrayOf(1,1,2)
        val nums2 = intArrayOf(1,2,3)
        val k = 2
        val output = kSmallestPairs(nums1, nums2, k)
        val correctOutput = listOf(listOf(1,1), listOf(1,1))
        assertContentEquals(correctOutput, output)
    }
}