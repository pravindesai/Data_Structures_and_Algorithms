package kotlinTips

fun main(){

    val num = 10
    val result = calculate(num)
    println("Result: ${result}")

}

inline fun calculate(i:Int):Int{
    val multiplier = 5
    val divider = 2
    return (i*multiplier)/divider
}