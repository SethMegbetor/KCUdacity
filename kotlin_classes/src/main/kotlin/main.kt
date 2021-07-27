class Rectangle(var height: Double,var length:Double){
    var perimeter = (height +length)*2
}

class Year(month:Double, day:Double){
    var totalDays = (month * day)
}

//open classes: class that can be inherited by another class

//open class  Shape
//
//class Rectangle(var height: Double, var length: Double): Shape(){
//    var perimeter = (height + length)*2
//}

// end of open class
fun main(){
    val rectangle = Rectangle(5.0,2.0)
    println("the perimeter is ${rectangle.perimeter}")
    println()
    val year = Year(12.0,30.0)
    println("the number of days is a year is: ${year.totalDays}")
}