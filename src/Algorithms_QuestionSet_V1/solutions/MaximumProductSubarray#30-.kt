package Algorithms_QuestionSet_V1.solutions

fun main(){
    val array = arrayOf(6, -3, -10, 0, 2)

    println("${maxProduct(array)}")
}

fun maxProduct(array: Array<Int>):Int {
    var maxMultiplication = 0
    (0 until array.size).forEach {  outIndex ->
        var mutiplication = 1
        (outIndex until array.size).forEach {  innerIndex ->
            mutiplication = mutiplication.times(array[innerIndex])
        }
        if (mutiplication>maxMultiplication){
            maxMultiplication = mutiplication
        }

    }

    return maxMultiplication
}