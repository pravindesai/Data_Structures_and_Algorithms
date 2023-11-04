package Algorithms_QuestionSet_V1.solutions

fun main(){
    val array = arrayOf(1, 5, 7, 1)
    val addition = 6
    println("2nd largest element is ${getPairsCount(array, addition)}")

    val array2 = arrayOf(1, 1, 1, 1)
    val addition2 = 2
    println("2nd largest element is ${getPairsCount(array2, addition2)}")

}

fun getPairsCount(array: Array<Int>, addition:Int):Int{
    var count = 0

    (0 until array.size).forEach { outIndex ->
        (0 until outIndex).forEach { innerIndex ->
            if (array[outIndex].plus(array[innerIndex]) == addition) count++
        }
    }

    return count
}