package kotlinTips

fun main(){
    val myCar = Car()

    myCar runs 10 turn "LEFT" runs 10 checkOdometer true turn "RIGHT" runs 20 turn "LEFT" checkOdometer true

}

class Car(){
    var totalDistance = 0
    var turns = arrayListOf<String>()

    infix fun runs(distance:Int):Car{
        totalDistance += distance
        return this
    }

    infix fun checkOdometer(check:Boolean):Car{
        if (check)
            println("Total Distance $totalDistance")
        return this
    }

    infix fun turn(side:String):Car{
        turns.add(side)
        return this
    }
}