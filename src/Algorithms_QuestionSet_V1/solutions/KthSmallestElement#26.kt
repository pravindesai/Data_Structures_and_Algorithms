package Algorithms_QuestionSet_V1.solutions

fun main(){

    val array = arrayOf( 7, 10, 4, 3, 20, 15)
    val k = 3
    println("$k th smallest element is ${kthSmallest(k, array)}")

    val array2 = arrayOf( 7, 10, 4, 20, 15)
    val k2 = 4
    println("$k2 th smallest element is ${kthSmallest(k2, array2)}")
}
fun kthSmallest(k: Int, array: Array<Int>):Int {

    val sortedArray = array.clone()

    (sortedArray.indices).forEach { i->
        (0 until i).forEach {  j->
            if (sortedArray[i]<sortedArray[j]) {
                val temp = sortedArray[i]
                sortedArray[i] = sortedArray[j]
                sortedArray[j] = temp
            }
        }
    }

    println(sortedArray.joinToString(", "))

    return sortedArray[k-1]
}
