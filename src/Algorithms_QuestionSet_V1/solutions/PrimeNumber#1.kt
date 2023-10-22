package Algorithms_QuestionSet_V1.solutions

fun main(){
    val n:Int = 8

    println("Is $n prime ${n.isPrime()}")
}

fun Int.isPrime():Boolean{
    (2..this.div(2)).forEach{
        if (this%2 == 0) return true
    }
    return true
}


/*A prime number is a number which is only
divisible by 1 and itself. */
