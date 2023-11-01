package Algorithms_QuestionSet_V1.solutions

fun countSubsets(arr: IntArray, n: Int): Int {
    val evenNumbers = HashSet<Int>()
    for (i in 0 until n) {
        if (arr[i] % 2 == 0) {
            evenNumbers.add(arr[i])
        }
    }
    var count = 0
    for (i in 0 until (1 shl n)) {
        var isDistinct = true
        for (j in 0 until n) {
            if ((i and (1 shl j)) != 0) {
                if (arr[j] % 2 != 0) {
                    isDistinct = false
                    break
                }
            }
        }
        if (isDistinct) {
            count++
        }
    }

    // Return the number of subsets.
    return count
}

fun main() {
    val array1 = intArrayOf(4, 2, 1, 9, 2, 6, 5, 3)
    val result1 = countSubsets(array1, array1.size)
    println("Count of distinct even subsets: $result1")

    val array2 = intArrayOf(10, 3, 4, 2, 4, 20, 10, 6, 8, 14, 2, 6, 9)
    val result2 = countSubsets(array2, array2.size)
    println("Count of distinct even subsets: $result2")
}
