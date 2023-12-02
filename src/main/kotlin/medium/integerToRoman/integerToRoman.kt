package medium.integerToRoman

import kotlin.math.pow

val romanNumerals = hashMapOf(
    1 to "I",
    4 to "IV",
    5 to "V",
    9 to "IX",
    10 to "X",
    40 to "XL",
    50 to "L",
    90 to "XC",
    100 to "C",
    400 to "CD",
    500 to "D",
    900 to "CM",
    1000 to "M"
)

fun intToRoman(num: Int): String {
    val listOfNumbers = mutableListOf<Int>()
    var roman = ""
    var currNum = num
    while (currNum > 0) {
        listOfNumbers.add(currNum % 10)
        currNum /= 10
    }
    for (digit in listOfNumbers.indices) {
        val value = listOfNumbers[digit] * (10.0.pow(digit).toInt())
        when {
            value in romanNumerals.keys -> roman = romanNumerals[value] + roman
            else -> roman = buildRoman(value) + roman
        }
    }
    return roman
}

fun buildRoman(num: Int): String {
    var remaining = num
    var result = ""
    for (value in romanNumerals.keys.sortedDescending()) {
        while (remaining >= value) {
            result += romanNumerals[value]
            remaining -= value
        }
    }
    return result
}