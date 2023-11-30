package medium.divideTwoIntegers

import kotlin.math.abs

fun divide(dividend: Int, divisor: Int): Int {
    if(dividend==divisor) return 1
    val isPositive = dividend>0 && divisor>0
    var absDividend = abs(dividend)
    val absDivisor = abs(divisor)
    var divident = 0
    while(absDividend>=absDivisor){
        var temp = 0
        while(absDividend>(absDivisor.shl(temp+1))){
            temp++
        }
        divident += (1.shl(temp))
        absDividend -= (absDivisor.shl(temp))
    }
    if(divident==(1.shl(31)) && isPositive){
        return Int.MAX_VALUE
    }
    return if(isPositive) divident else -divident
}