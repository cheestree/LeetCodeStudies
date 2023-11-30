package letterTilePossibilities

fun numTilePossibilities(tiles: String): Int {
    if (tiles.length == 1) return 1
    val permutations = mutableSetOf<String>()
    tiles.permutations("", permutations)
    return permutations.size
}

fun String.permutations(result: String, resultSet: MutableSet<String>) {
    if (result.isNotEmpty()) resultSet.add(result)
    for (i in indices) {
        removeRange(i, i + 1).permutations(result + this[i], resultSet)
    }
}