import kotlin.random.Random

fun main(): Unit {
    cleanTheOffice()
}

fun cleanTheOffice(){
    val day = rDay()
    val employee = employeeSweep(day)
    println("Today is $day and the employee cleaning the office is $employee")
}

fun rDay() : String{
    val week = listOf("Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday")
    return week [Random.nextInt(0,7)]
}

fun employeeSweep(day : String) : String {
    var employees = "all hands on deck"
    return when(day){
        "Monday" -> "xorse"
        "Tuesday" -> "spider"
        "Wednesday" -> "Bright"
        "Thursday" -> "Dela"
        "Friday" -> "Jemima"
        else -> "all hands on deck"
    }
}