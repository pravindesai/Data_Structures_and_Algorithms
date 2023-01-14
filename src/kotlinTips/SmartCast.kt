package kotlinTips

fun main(){

    val value:Any = 20.0

    //Smart cast
    when(value){
        is Int -> println("Value is integer")
        is String -> println("Value is string")
        else -> println("Value is ${value::class.java.simpleName}")
    }

    //Unsafe cast
    try {
        val v = value as String
        println(v)
    }catch (e:ClassCastException){
        println("${e.localizedMessage}")
    }

    //Safe cast
    val v:String? = value as? String
    println(v)

}