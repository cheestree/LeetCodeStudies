package longestSubstringWithoutRepeatingCharacters
//  https://leetcode.com/problems/longest-substring-without-repeating-characters/
fun lengthOfLongestSubstring(s: String): Int {
    var temp = 0

    for (i in s.indices) {
        var j = i + 1
        while (j < s.length && s[j] !in s.substring(i, j)) {
            j++
        }

        val substring = s.substring(i, j)
        temp = maxOf(temp, substring.length)
    }

    return temp
}