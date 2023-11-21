import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

/*
Question 1:
Given an array of strings such as
["A", "B", "C"]
return an array of objects such as
[ {"name": "A"}, {"name": "B"}, {"name": "C"} ]
*/


fun main(){
    val array = arrayOf("A", "B", "C")
    val newArray = array.map { name-> CustomObj(name) }

    println(newArray)
}

@Serializable
data class CustomObj(val name:String){
    override fun toString(): String {
        return Json.encodeToString(this)
    }
}

//output: [{"name":"A"}, {"name":"B"}, {"name":"C"}]