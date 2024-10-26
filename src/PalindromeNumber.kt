fun main() {
    var result = IsPalindrome(121)
    println(result)


}

fun IsPalindrome(x: Int): Boolean {

    var x1 = x.toString()
    if (x1.reversed() == x1) return true
    return false
}