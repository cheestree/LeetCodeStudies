package palindromeNumber
//  https://leetcode.com/problems/palindrome-number/

import kotlin.math.sign

fun isPalindrome(x: Int): Boolean {
    if (x.sign==-1) return false
    var count = 0
    var newX = x
    val digits = mutableListOf<Int>()

    while (newX != 0) {
        digits.add(newX % 10)
        count++
        newX /= 10
    }

    var right = count - 1
    var left = 0

    while (left < right) {
        if (digits[left] != digits[right]) return false
        left++
        right--
    }
    return true
}
