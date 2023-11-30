package smallestSubsequenceDistinctChars

import medium.smallestSubsequenceDistinctChars.smallestSubsequence
import kotlin.test.Test
import kotlin.test.assertEquals

class SmallestSubsequenceDistinctCharsTest {
    @Test
    fun smallestSubsequence1(){
        val str = "bcabc"
        val output = smallestSubsequence(str)
        val correctOutput = "abc"
        assertEquals(correctOutput, output)
    }

    @Test
    fun smallestSubsequence2(){
        val str = "cbacdcbc"
        val output = smallestSubsequence(str)
        val correctOutput = "acdb"
        assertEquals(correctOutput, output)
    }
}