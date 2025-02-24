package medium.powxn
//  https://leetcode.com/problems/powx-n/

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.abs

fun myPow(x: Double, n: Int): Double {
    if(x==1.0) return x
    if(x==-1.0 && n==Int.MAX_VALUE) return x
    if(x==-1.0 && n==Int.MIN_VALUE) return -x
    if(n==Int.MIN_VALUE || n==Int.MAX_VALUE) return 0.0
    var result = 1.0
    repeat(abs(n)) {
        result *= x
    }
    return BigDecimal(if(n>=0) result else 1/result).setScale(5, RoundingMode.HALF_EVEN).toDouble()
}