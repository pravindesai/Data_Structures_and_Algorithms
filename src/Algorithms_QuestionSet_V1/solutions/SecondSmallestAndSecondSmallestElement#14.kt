package Algorithms_QuestionSet_V1.solutions

fun main(){
    val array = arrayListOf<Int>(6,-1,2,4,0,1,3,50)
    println("Second Smallest is ${secondSmallest(array)}")
}
fun secondSmallest(arrayList: ArrayList<Int>):Int{
    return if (arrayList.size<2) {
        -1
    } else{
        var firstSmallest = arrayList[0]
        var secondSmallest = arrayList[0]

        arrayList.forEach {
            when {
                (it<firstSmallest) -> {
                    secondSmallest = firstSmallest
                    firstSmallest = it
                }

                ((it > firstSmallest) && (it < secondSmallest)) -> {
                    secondSmallest = it
                }
            }
        }
        secondSmallest
    }
}