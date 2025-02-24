package easy.mergeSortedArray

import kotlin.test.Test
import kotlin.test.assertContentEquals

class MergeSortedArrayTest {
    @Test
    fun merge1(){
        var nums1 = intArrayOf(1,2,3,0,0,0)
        val m = 3
        val nums2 = intArrayOf(2,5,6)
        val n = 3
        merge(nums1, m, nums2, n)
        val correctOutput = intArrayOf(1,2,2,3,5,6)
        assertContentEquals(correctOutput, nums1)
    }

}