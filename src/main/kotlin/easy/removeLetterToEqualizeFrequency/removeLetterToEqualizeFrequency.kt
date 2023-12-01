package easy.removeLetterToEqualizeFrequency

fun equalFrequency(word: String): Boolean {
    val groups = word.groupingBy { it }.eachCount()
    if(groups.values.all { it == 1 }) return true
    return groups.values.all { it == groups.values.first() }
}