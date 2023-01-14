package kotlinTips

fun main(){

    val bike = Bike()

}


class Bike(){
    operator fun invoke(){
        println("Ready to start")
    }
}