package Algorithms_QuestionSet_V1.solutions

fun main(){
    val sortedArray = arrayListOf( 1, 3, 3, 4, 3)
    val number  = 3
    println("First last occurrence of $number is ${firstAndLast(number, sortedArray).joinToString(" & ")} ")

    val sortedArray2 = arrayListOf( 1, 2, 3, 4)
    val number2  = 5
    println("First last occurrence of $number is ${firstAndLast(number2, sortedArray2).joinToString(" & ")} ")

}
fun firstAndLast(number: Int, sortedArray: ArrayList<Int>):Array<Int>{

    var first = -1
    var last  = -1

    sortedArray.forEachIndexed { index, num ->

        if (number==num && first == -1){
            first = index
            last  = index
        }else if ( (number == num) && (index>first) ){
            last = index
        }

    }

    return arrayOf(first, last)
}
