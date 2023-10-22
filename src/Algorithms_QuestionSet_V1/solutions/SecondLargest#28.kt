package Algorithms_QuestionSet_V1.solutions

fun main(){
    val array = arrayOf(34, 12, 35, 1, 36, 10, 30, 1, 33, 60, 50)
    println("2nd largest element is ${print2largest(array)}")
}

fun print2largest(array: Array<Int>):Int?{

    var firstLargest:Int? = null
    var secondLargest:Int? = null

    (array.indices).forEach { index ->
        val element = array[index]
        when{
            firstLargest==null ->{
                firstLargest = element
            }
            element>firstLargest!! ->{
                secondLargest = firstLargest
                firstLargest = element
            }
            secondLargest==null ->{
                secondLargest = element
            }
            (element>secondLargest!!) and (element<firstLargest!!)->{
                secondLargest = element
            }
        }

    }
    return secondLargest
}