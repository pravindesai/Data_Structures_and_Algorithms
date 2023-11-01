package Algorithms_QuestionSet_V1.solutions
fun allSubsets(arr: IntArray, N: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    val currentSubset = mutableListOf<Int>()

    arr.sort()

    fun backtrack(start: Int) {
        result.add(ArrayList(currentSubset))

        for (i in start until N) {
            if (i > start && arr[i] == arr[i - 1]) {
                continue
            }

            currentSubset.add(arr[i])
            backtrack(i + 1)
            currentSubset.removeAt(currentSubset.size - 1)
        }
    }
    backtrack(0)
    return result
}

fun main() {
    val array = intArrayOf(2,1,2)
    val result = allSubsets(array, array.size)

    for (subset in result) {
        println(subset)
    }
}
