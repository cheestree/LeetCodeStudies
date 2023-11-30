package longestPalindromicSubstring
//  https://leetcode.com/problems/longest-palindromic-substring/

fun longestPalindrome(s: String): String {
    if(s.isEmpty()) return ""
    var longest = s.substring(0, 1)

    for (i in 1 until s.length) {
        var palindrome = expandAroundCenter(s, i, i)
        if (palindrome.length > longest.length) {
            longest = palindrome
        }

        palindrome = expandAroundCenter(s, i - 1, i)
        if (palindrome.length > longest.length) {
            longest = palindrome
        }
    }

    return longest
}

fun expandAroundCenter(s: String, left: Int, right: Int): String {
    var l = left
    var r = right

    while (l >= 0 && r < s.length && s[l] == s[r]) {
        l--
        r++
    }

    return s.substring(l + 1, r)
}