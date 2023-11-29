package letterTilePossibilities

fun numTilePossibilities(tiles: String): Int {
    if (tiles.length == 1) return 1
    val total = tiles.length
    var combinations = 0L

    val charCount = tiles.groupBy { it }.mapValues { it.value.size }
    for (count in charCount.values) {
        combinations += multinomialCoefficient(total, listOf(count, total - count))
    }

    return combinations.toInt()
}

fun multinomialCoefficient(n: Int, counts: List<Int>): Long {
    if (counts.sum() != n) {
        throw IllegalArgumentException("The sum of counts must be equal to n.")
    }

    val numerator = factorial(n)
    val denominator = counts.map { factorial(it) }.reduce { acc, value -> acc * value }

    return numerator / denominator
}

fun factorial(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {
        (2..n.toLong()).reduce { acc, i -> acc * i }
    }
}