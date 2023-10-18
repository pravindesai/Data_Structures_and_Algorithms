import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class Data(
    val id:Int,
    val name:String,
    val city:String,
    val country:String
)


fun main(){

    val d1=Data(1,"name","city","country")

    val d1Json = Json.encodeToString(d1)

    println(d1Json)

}