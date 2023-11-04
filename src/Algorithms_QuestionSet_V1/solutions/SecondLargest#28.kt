package Algorithms_QuestionSet_V1.solutions

fun main(){
    val array = arrayOf(12, 35, 1, 10, 34, 1)
    println("2nd largest element is ${print2largest(array)}")

    val array2 = arrayOf(10, 5, 10)
    println("2nd largest element is ${print2largest(array2)}")


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