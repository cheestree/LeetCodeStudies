package medium.triangle

fun minimumTotal(triangle: List<List<Int>>): Int {
    val n = triangle.size

    //  Store minimum path sums
    val dp = Array(n) { IntArray(n) }

    //  Bottom row of dp with last row of triangle
    for (i in 0 until n) {
        dp[n - 1][i] = triangle[n - 1][i]
    }

    //  Bottom up, update each element in each row based on the min of adjacent 2 values below it
    for (i in n - 2 downTo 0) {
        for (j in 0..i) {
            dp[i][j] = triangle[i][j] + minOf(dp[i + 1][j], dp[i + 1][j + 1])
        }
    }

    //  Top value, contains min path
    return dp[0][0]
}