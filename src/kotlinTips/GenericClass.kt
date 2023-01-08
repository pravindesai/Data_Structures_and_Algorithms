package kotlinTips
fun main() {

val genericClassWithInt:Custom<Int> = Custom(123)
val genericClassWithString:Custom<String> = Custom("string")

}

class Custom<T>(val v:T){
    init{
        when{
            v is String -> println("value ${v} is String")
            v is Int -> println("value ${v} is Integer")
            else -> println("value ${v} is Unknown Data Type")
        }
    }
}