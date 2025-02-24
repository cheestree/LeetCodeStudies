package utils

fun integerDigitAmount(input: Int): Int{
    var count = 0
    var newX = input
    while (newX != 0) {
        count++
        newX /= 10
    }
    return count
}