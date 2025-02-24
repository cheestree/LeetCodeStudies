package easy.validParentheses

fun isValid(s: String): Boolean {
    if(s.length % 2 != 0) return false
    var temp = s
    for (i in temp.indices){
        temp = temp.replace("{}", "").replace("()", "").replace("[]", "")
    }
    return temp == ""
}