package Algorithms_QuestionSet_V1.solutions

fun main(){
    val array = arrayOf(4, 2, 1, 9, 2, 6, 5, 3)
    println("Total subset of even number are ${countSubsets(array)}")   // 7
}

fun countSubsets(array: Array<Int>):Int{

    val count = 0
    val listOfSubset = arrayListOf<List<Int>>()

    (0 until  array.size).forEach { i ->
        val subset = arrayListOf<Int>()
        (i until array.size).forEach { j ->

        }
    }

    return 0
}