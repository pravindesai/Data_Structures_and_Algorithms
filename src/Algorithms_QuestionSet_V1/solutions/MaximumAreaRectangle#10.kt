package Algorithms_QuestionSet_V1.solutions

data class Rectangle(val length:Float,val breadth:Float){
    fun area():Float = length.times(breadth)
}

fun main(){

    val rectangles = arrayListOf<Rectangle>(
        Rectangle(length = 1f, breadth = 2f),
        Rectangle(length = 3f, breadth = 4f),
        Rectangle(length = 5f, breadth = 6f),
        Rectangle(length = 3f, breadth = 3f)
    )

    val rectangleMaxArea = calculateArea(rectangles)

    println("$rectangleMaxArea is maximum area of given rectangles.")
}

fun calculateArea(rectangles: ArrayList<Rectangle>): Float {

    var maxArea = rectangles.first().area()

    rectangles.forEach {
        val area = it.area()
        if (area >= maxArea) maxArea=area
    }

    return maxArea
}
