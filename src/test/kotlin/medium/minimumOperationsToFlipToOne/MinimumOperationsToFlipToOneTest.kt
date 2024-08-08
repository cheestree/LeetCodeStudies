package medium.minimumOperationsToFlipToOne

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumOperationsToFlipToOneTest {
    @Test
    fun longestSubstring1(){
        val output = minOperations(intArrayOf(0,1,1,1,0,0))
        assertEquals(3, output)
    }

    @Test
    fun longestSubstring2(){
        val output = minOperations(intArrayOf(0,1,1,1))
        assertEquals(-1, output)
    }
}