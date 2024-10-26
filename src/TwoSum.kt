fun main() {
    val ArrayNums = intArrayOf(1,2,3,4,5,6,7,8)
    val Targets = 7
    val Result = TwoSum(ArrayNums, Targets)
    println(Result.joinToString())

}

fun TwoSum(nums: IntArray, target: Int): IntArray {
    var numeIndex = mutableMapOf<Int, Int>()
    for ((index, num) in nums.withIndex()) {
        var diff = target - num
        if (numeIndex.containsKey(diff)) {
            return intArrayOf(numeIndex[diff]!!, index)
        }
        numeIndex[num] = index
    }
    throw IllegalArgumentException("Решение не найдено")
}