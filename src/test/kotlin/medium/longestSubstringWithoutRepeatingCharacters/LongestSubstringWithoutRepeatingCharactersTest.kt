package longestSubstringWithoutRepeatingCharacters

import medium.longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring
import kotlin.test.Test
import kotlin.test.assertEquals

class LongestSubstringWithoutRepeatingCharactersTest{
    @Test
    fun longestSubstring1(){
        val str = "abcabcbb"
        val output = lengthOfLongestSubstring(str)
        val correctOutput = 3
        assertEquals(correctOutput, output)
    }

    @Test
    fun longestSubstring2(){
        val str = "bbbbb"
        val output = lengthOfLongestSubstring(str)
        val correctOutput = 1
        assertEquals(correctOutput, output)
    }

    @Test
    fun longestSubstring3(){
        val str = "pwwkew"
        val output = lengthOfLongestSubstring(str)
        val correctOutput = 3
        assertEquals(correctOutput, output)
    }
}