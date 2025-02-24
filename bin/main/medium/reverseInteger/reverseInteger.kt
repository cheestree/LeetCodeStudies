package medium.reverseInteger
//  https://leetcode.com/problems/reverse-integer/

fun reverse(x: Int): Int {
    val reversedString = if (x < 0) {
        "-${x.toString().drop(1).reversed()}"
    } else {
        x.toString().reversed()
    }
    return try {
        reversedString.toInt()
    }catch (e: Exception){
        0
    }
}
