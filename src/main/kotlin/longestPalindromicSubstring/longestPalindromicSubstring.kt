package longestPalindromicSubstring
//  https://leetcode.com/problems/longest-palindromic-substring/

fun longestPalindrome(s: String): String {
    var temp = s[0].toString()
    for(i in 1..s.length){
        if(temp.last() != s[i]){
            temp += s[i]
        }
    }
    return temp
}