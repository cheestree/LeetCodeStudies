package easy.searchInsertPosition

import medium.findKPairsSmallestSums.kSmallestPairs
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class SearchInsertPositionTest {
    @Test
    fun searchInsert1(){
        val arr = intArrayOf(1,3,5,6)
        val target = 5
        val output = searchInsert(arr, target)
        val correctOutput = 2
        assertEquals(correctOutput, output)
    }

    @Test
    fun searchInsert2(){
        val arr = intArrayOf(1,3,5,6)
        val target = 2
        val output = searchInsert(arr, target)
        val correctOutput = 1
        assertEquals(correctOutput, output)
    }

    @Test
    fun searchInsert3(){
        val arr = intArrayOf(1,3,5,6)
        val target = 7
        val output = searchInsert(arr, target)
        val correctOutput = 4
        assertEquals(correctOutput, output)
    }
}