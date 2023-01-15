package src.kotlinTips

import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun main(){
    val p1 = Person("Pravin", "Shrirampur")

    val p1j = Json.encodeToString(p1)
    println(p1j)

    val p2 = Json.decodeFromString<Person>(p1j)
    println(p2)
}
@Serializable
data class Person(val name:String, val address:String)