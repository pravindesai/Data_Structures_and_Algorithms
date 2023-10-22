package Algorithms_QuestionSet_V1.solutions

fun main(){
    val array = arrayListOf<Int>(7,6,2,4,1,3,5,5,11)
    println("Third largest element is ${thirdLargest(array)}")
}
fun thirdLargest(arrayList: ArrayList<Int>):Int{
    return if (arrayList.size<3) {
        -1
    } else{
        var firstLargest = arrayList[0]
        var secondLargest = arrayList[0]
        var thirdLargest = arrayList[0]

        arrayList.forEach {
            when{
                (it>firstLargest) ->{
                    thirdLargest = secondLargest
                    secondLargest = firstLargest
                    firstLargest = it
                }
                ((it<firstLargest && it > secondLargest) || (secondLargest==firstLargest))->{
                    thirdLargest = secondLargest
                    secondLargest = it
                }
                ((it<secondLargest && it > thirdLargest) || (thirdLargest==firstLargest) )->{
                    thirdLargest = it
                }
            }

        }

        thirdLargest
    }
}