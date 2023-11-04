package Algorithms_QuestionSet_V1.solutions

fun main(){
    val array = arrayOf(1,2,3,5)
    println("Distinct element is ${findDistinctElement(array)}")

    val array2 = arrayOf(6,1,2,8,3,4,7,10,5)
    println("Distinct element is ${findDistinctElement(array2)}")
}

fun findDistinctElement(array: Array<Int>):Int {
    var distinctElement = -1
    var maxElement = array[0]
    var smallestElemtn = array[0]
    array.forEach {
        if (maxElement<it) maxElement = it
        if (smallestElemtn>it) smallestElemtn = it
    }

    (smallestElemtn until maxElement).forEach{  element ->
        if (array.contains(element).not()){
            distinctElement = element
        }
    }

    return distinctElement
}