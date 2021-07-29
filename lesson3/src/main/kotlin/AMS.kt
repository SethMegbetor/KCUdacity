import kotlin.random.Random

//import java.util.*
//
//fun main(): Unit {
//    println("hi")
//    dayOfWeek()
//}
//
//fun dayOfWeek(): Unit {
//println("what day is it today?")
//    var DOW = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
//    println(when (DOW){
//        2 -> "Monday"
//        3 -> "Tuesday"
//        4 -> "Wednesday"
//        5 -> "Thursday"
//        6 -> "Friday"
//        7 -> "Saturday"
//        1 -> "Sunday"
//        else -> "Something is wrong"
//    })
//}


//fun main(args:Array<String>): Unit {
//    print("Hello ${args[0]}")
//
//    val isUnit = println("This is an expression")
//    println(isUnit)
//
//    val temperature = 60
//    val isHot = if (temperature > 50) true else false
//    println(isHot)
//
//    val message = "You are ${ if (temperature > 50) "fried," else "safe,"} fish"
//    println(message)
//}

//

import java.util.*
import kotlin.math.nextDown

fun main(arg: Array<String>){
    feedTheFish()
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish will eat $food")

//    if (shouldChangeWater(da)){
//        println("Change the water today")
//    }

//    swim()
//    swim(speed = "slow")
}

//fun swim(speed: String = "fast"){
//    println("swimming $speed")
//}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20{

    }
) {
}

fun randomDay() : String {
    val week = listOf ("Monday", "Tuesday","Wednesday","Thursday","Friday", "Saturday", "Sunday")
    return week[Random.nextInt(0,7)]
}

fun fishFood (day : String): String{
    var food = "fasting"

    when (day){
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquito"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}