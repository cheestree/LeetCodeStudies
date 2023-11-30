package plusOne
//  https://leetcode.com/problems/plus-one/

import java.math.BigInteger

fun plusOne(digits: IntArray): IntArray {
    val res = digits.joinToString("").toBigInteger().add(BigInteger.ONE)
    return res.toString().toCharArray().map { it.toString().toInt() }.toIntArray()
}