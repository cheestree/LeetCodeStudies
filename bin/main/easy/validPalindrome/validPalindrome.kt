package easy.validPalindrome
//  https://leetcode.com/problems/valid-palindrome/description/

fun isPalindrome(s: String): Boolean {
    val formattedString = s.lowercase().filter { it.isLetterOrDigit() }
    var left = 0
    var right = formattedString.length-1
    while(left < right){
        if(formattedString[left] != formattedString[right]){
            return false
        }
        left++
        right--
    }
    return true
}