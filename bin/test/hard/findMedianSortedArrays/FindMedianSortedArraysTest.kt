package findMedianSortedArrays

import hard.findMedianSortedArrays.findMedianSortedArrays
import kotlin.test.Test
import kotlin.test.assertEquals

class FindMedianSortedArraysTest {
    @Test
    fun findMedianSortedArrays1(){
        val arr1 = intArrayOf(1, 3)
        val arr2 = intArrayOf(2)
        val output = findMedianSortedArrays(arr1, arr2)
        val correctOutput = 2.0
        assertEquals(correctOutput, output)
    }

    @Test
    fun findMedianSortedArrays2(){
        val arr1 = intArrayOf(1, 2)
        val arr2 = intArrayOf(3,4)
        val output = findMedianSortedArrays(arr1, arr2)
        val correctOutput = 2.5
        assertEquals(correctOutput, output)
    }
}