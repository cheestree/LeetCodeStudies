package medium.stringToInteger
//  https://leetcode.com/problems/string-to-integer-atoi/

fun myAtoi(s: String): Int {
    if (s.isEmpty()) return 0

    var i = 0
    var sign = 1
    var result = 0

    //  Skip leading whitespaces
    while (i < s.length && s[i] == ' ') {
        i++
    }

    //  Check for a sign
    if (i < s.length && (s[i] == '-' || s[i] == '+')) {
        sign = if (s[i++] == '-') -1 else 1
    }

    //  Process digits
    while (i < s.length && s[i].isDigit()) {
        val digit = s[i] - '0'

        //  Check for overflow
        if (result > Int.MAX_VALUE / 10 || (result == Int.MAX_VALUE / 10 && digit > 7)) {
            return if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE
        }

        result = result * 10 + digit
        i++
    }

    return sign * result
}