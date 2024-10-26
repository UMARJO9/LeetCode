fun main() {
    var result = RomanToInteger("MCMXCIV").toString()
    println(result)
}

fun RomanToInteger(x: String): Int {
    val RomanMap = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    var total = 0
    var prevvalue = 0
    for (char in x.reversed()) {

        val currentvalue = RomanMap[char] ?: 0

        if (currentvalue < prevvalue) {
            total -= currentvalue
        } else {
            total += currentvalue
        }
        prevvalue = currentvalue
    }
    return total
}