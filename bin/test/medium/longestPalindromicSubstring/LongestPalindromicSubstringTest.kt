package longestPalindromicSubstring

import medium.longestPalindromicSubstring.longestPalindrome
import kotlin.test.Test
import kotlin.test.assertEquals

class LongestPalindromicSubstringTest {
    @Test
    fun longestSubstring1(){
        val str = "babad"
        val output = longestPalindrome(str)
        val correctOutput = "bab"
        assertEquals(correctOutput, output)
    }

    @Test
    fun longestSubstring2(){
        val str = "cbbd"
        val output = longestPalindrome(str)
        val correctOutput = "bb"
        assertEquals(correctOutput, output)
    }
}