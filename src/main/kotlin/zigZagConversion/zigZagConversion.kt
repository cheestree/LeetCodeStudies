package zigZagConversion
//  https://leetcode.com/problems/zigzag-conversion/

fun convert(s: String, numRows: Int): String {
    if(numRows==1 || numRows >= s.length) return s

    val rows = Array(numRows) { StringBuilder() }
    var direction = 1
    var row = 0

    for (char in s) {
        rows[row].append(char)
        if (row == 0) {
            direction = 1
        } else if (row == numRows - 1) {
            direction = -1
        }
        row += direction
    }

    return rows.joinToString("")
}
