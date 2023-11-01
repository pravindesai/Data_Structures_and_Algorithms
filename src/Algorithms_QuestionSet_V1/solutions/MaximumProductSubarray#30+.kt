package Algorithms_QuestionSet_V1.solutions

fun maxProduct(arr: LongArray, n: Int): Long {
    if (n == 0) return 0

    var maxEndingHere = arr[0]
    var minEndingHere = arr[0]
    var maxProduct = arr[0]

    for (i in 1 until n) {
        if (arr[i] < 0) {
            val temp = maxEndingHere
            maxEndingHere = minEndingHere
            minEndingHere = temp
        }

        maxEndingHere = maxOf(arr[i], maxEndingHere * arr[i])
        minEndingHere = minOf(arr[i], minEndingHere * arr[i])

        maxProduct = maxOf(maxProduct, maxEndingHere)
    }

    return maxProduct
}

fun main() {
    val array = longArrayOf(6, -3, -10, 0, 2)
    val result = maxProduct(array, array.size)
    println("Maximum Product Subarray: $result")
}
