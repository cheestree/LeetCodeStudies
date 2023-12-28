package easy.longestCommonPrefix

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestCommonPrefixTest {
    @Test
    fun longestCommonPrefix1(){
        val str = arrayOf("flower","flow","flight")
        val output = longestCommonPrefix(str)
        val correctOutput = "fl"
        assertEquals(correctOutput, output)
    }

    @Test
    fun longestCommonPrefix2(){
        val str = arrayOf("dog","racecar","car")
        val output = longestCommonPrefix(str)
        val correctOutput = ""
        assertEquals(correctOutput, output)
    }

    @Test
    fun longestCommonPrefix3(){
        val str = arrayOf("ab","a")
        val output = longestCommonPrefix(str)
        val correctOutput = "a"
        assertEquals(correctOutput, output)
    }

    @Test
    fun longestCommonPrefix4(){
        val str = arrayOf("a")
        val output = longestCommonPrefix(str)
        val correctOutput = "a"
        assertEquals(correctOutput, output)
    }
}