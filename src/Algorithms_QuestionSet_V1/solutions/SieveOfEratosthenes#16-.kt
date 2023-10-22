package Algorithms_QuestionSet_V1.solutions

fun main(){
    val limit = 50
    sieveOfEratosthenes(limit)
}

fun sieveOfEratosthenes(limit:Int){
    val list = arrayListOf<Int>()
    (2..limit).forEach { element->
        if (element%2!=0 && element%3!=0){
            list.add(element)
        }
    }
    println(list)

}