package easy.occurrencesAfterBigram
//  https://leetcode.com/problems/occurrences-after-bigram/

fun findOcurrences(text: String, first: String, second: String): Array<String> {
    val newText = text.split(" ")
    val arr = mutableListOf<String>()
    for (i in 0 until newText.size - 2) {
        if (newText[i] == first && newText[i + 1] == second) {
            arr.add(newText[i + 2])
        }
    }
    return arr.toTypedArray()
}