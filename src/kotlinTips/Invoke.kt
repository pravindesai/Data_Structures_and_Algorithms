package kotlinTips

fun main(){

    val bike = Bike()
    bike()

}


class Bike(){
    operator fun invoke(){
        println("Ready to start")
    }
}