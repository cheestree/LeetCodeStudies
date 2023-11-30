package powxn

import kotlin.math.abs
import kotlin.math.pow

fun myPow(x: Double, n: Int): Double {
    var result = 1.0
    repeat(abs(n)) {
        result *= x
    }
    return if (n >= 0) result.roundToDecimal(5) else 1 / result.roundToDecimal(5)
}

fun Double.roundToDecimal(exponent: Int): Double {
    val base = 1
    val result = base * 10.0.pow(exponent)
    return (this * result).toLong() / result
}