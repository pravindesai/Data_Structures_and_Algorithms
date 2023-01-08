package kotlinTips

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


fun main(){

        val formattedDate = LocalDateTime.now().getFormattedDate("yyyy/MM/dd : HH:mm")
        println(formattedDate)
}

fun LocalDateTime.getFormattedDate(format:String):String{
    val currentTime = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern(format)
    return currentTime.format(formatter)
}