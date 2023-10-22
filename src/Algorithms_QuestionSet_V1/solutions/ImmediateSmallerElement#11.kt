package Algorithms_QuestionSet_V1.solutions

fun main(){
    val arrayList = arrayListOf<Int>(5,6,2,3,1,7)
    immediateSmaller(arrayList)
    println(arrayList)
}

fun immediateSmaller(array: ArrayList<Int>){
    array.forEachIndexed { index, element ->
        val nextIndex = index+1
        array[index] = when {
            (nextIndex >= array.size) -> -1
            (array[nextIndex]> element) -> -1
            else -> array[nextIndex]
        }
    }
}