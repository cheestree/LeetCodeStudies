package easy.longestCommonPrefix

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    if (strs.size == 1) return strs.first()
    for (i in 0 until strs[0].length) {
        if (!strs.all { it.startsWith(strs[0].substring(0, i + 1)) }) {
            return strs[0].substring(0, i)
        }
    }
    return strs[0]
}