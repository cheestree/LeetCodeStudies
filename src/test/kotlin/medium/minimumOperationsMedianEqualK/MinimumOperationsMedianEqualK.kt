package medium.minimumOperationsMedianEqualK

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumOperationsMedianEqualK {
    @Test
    fun minOperations1(){
        val output = minOperationsToMakeMedianK(intArrayOf(2,5,6,8,5), 4)
        assertEquals(2, output)
    }

    @Test
    fun minOperations2(){
        val output = minOperationsToMakeMedianK(intArrayOf(2,5,6,8,5), 7)
        assertEquals(3, output)
    }

    @Test
    fun minOperations3(){
        val output = minOperationsToMakeMedianK(intArrayOf(1,2,3,4,5,6), 4)
        assertEquals(0, output)
    }
}