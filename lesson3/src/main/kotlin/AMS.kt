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

fun main(): Unit {
    var time = 20
    var beforeMidDay = if (time < 12) true else false
    println(beforeMidDay)

    var check = "the time is ${if (time < 12) "before," else "after"} midday"
    print(check)
}