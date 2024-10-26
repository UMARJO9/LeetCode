package String

fun main() {
    val array = arrayOf("umrege", "umarjon", "umarzoda")
    val result = LongestCommonPrefix(array)
    println(result)


}

fun LongestCommonPrefix(s: Array<String>): String {
    if (s.isEmpty()) return ""
    var perfix = s[0]

    for (i in 1 until s.size) {
        while (s[i].startsWith(perfix).not()) {
            perfix = perfix.substring(0, perfix.length - 1)

        }
    }
    return perfix

}