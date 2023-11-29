package smallestSubsequenceDistinctChars

fun smallestSubsequence(s: String): String {
    val alphabet = s.toSet().sorted()
    println(alphabet)
    return ""
}