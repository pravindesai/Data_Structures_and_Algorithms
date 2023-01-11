package kotlinTips

import java.lang.IndexOutOfBoundsException

fun main(){

    //Destructing Pair
    val location = Pair(4232.54739, 923423.01127)
    val (latitude,longitude) = location

    println("Lat: $latitude - Long: $longitude")
    println("Lat: ${location.component1()} - Long: ${location.component2()}")

    //Destruction data class
    val emp = Employee(123, "pravin desai", "software engineer")
    val (id,name) = emp
    println("ID: $id - Name: $name")
    println("ID: ${emp.component1()} - Name: ${emp.component2()}")

    val sEmp = SimpleEmployee(123, "pravin desai", "software engineer")
    val (sId,sName) = sEmp
    println("SID: $sId - SName: $sName")
    println("SID: ${sEmp.component1()} - SName: ${sEmp.component2()}")


    //Destructing list
    val fruits = listOf("Apple", "Banana", "Chiku", "Dragon Fruit")
    val (firstFruit, secondFruit) = fruits
    println("$firstFruit - $secondFruit")

    //Invalid Destruction
    try {
        val alphabets = listOf("A", "B")
        val (firstAlphabet, secondAlphabet, thirdAlphabet) = alphabets
        println("$firstAlphabet - $secondAlphabet")
    }catch (e:IndexOutOfBoundsException){
        println("Invalid Destruction due to -> ${e.localizedMessage}")
    }


}

data class Employee(val empId:Int, val name:String, val designation:String)

class SimpleEmployee(val empId:Int, val name:String, val designation:String){
    operator fun component1(): Int = empId
    operator fun component2(): String = name
    operator fun component3(): String = designation
}