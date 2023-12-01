package hard.regularExpressionMatching
//  https://leetcode.com/problems/regular-expression-matching/

fun isMatch(s: String, p: String): Boolean {
    val dp = Array(s.length + 1) { BooleanArray(p.length + 1) }
    dp[0][0] = true

    //  Handle patterns with '*'
    for (i in 1..p.length) {
        if (p[i - 1] == '*') {
            dp[0][i] = dp[0][i - 2]
        }
    }

    for (i in 1..s.length) {
        for (j in 1..p.length) {
            if (p[j - 1] == s[i - 1] || p[j - 1] == '.') {
                dp[i][j] = dp[i - 1][j - 1]
            } else if (p[j - 1] == '*') {
                dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (s[i - 1] == p[j - 2] || p[j - 2] == '.'))
            }
        }
    }

    return dp[s.length][p.length]
}