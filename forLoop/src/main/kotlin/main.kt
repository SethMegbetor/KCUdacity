//beginning of for loop

//fun main(){
//    val items = listOf("apple", "banana","kiwifruit")
//    for (item in items){
//        println(item)
//    }
//    println()
//    students()
//}
//
//fun students(): Unit {
//    val incubation = listOf("wonder","vivian","albert")
//    for (index in incubation.indices)
//        println("student at $index is ${incubation[index]}")
//}

//end of for loop

//start of while loop
//fun main(){
//    val incubatees = listOf("wonder","vivian","sika", "albert")
//    var index = 0
//    while (index < incubatees.size){
//        println("item at the index $index is ${incubatees[index]}")
//        index++
//    }
//}
//end of while loop

//start of when expression
//fun describe(obj: Any): String =
//    when (obj){
//        1 -> "One"
//        "hello" -> "Greeting"
//        is Long -> "Long"
//        !is String -> "Not a string"
//        else -> "Unknown"
//    }
//
//fun main(){
//    println(describe(1))
//    println(describe("Hello"))
//    println(describe(1000L))
//    println(describe(2))
//    println(describe("other"))
//}
//end of expression

//Start of Ranges
//fun main(){
//    val x = 11
//    val y = 9
//    if (x in 1..y+1){
//        println("fits in range")
//    }else{
//        println("not in range, retry")
//    }
//}

//fun main(): Unit {
//    val list = listOf("a","b","c")
//
//    if (-1 !in 0..list.lastIndex){
//        println("-1 is out to the range")
//    }
//    if (list.size !in list.indices){
//        println("list size is out of valid list indices range, too")
//    }
//}

//fun main(): Unit {
//    for (x in 1..5){
//        println(x)
//    }
//}

//fun main(): Unit {
//    for (x in 1..10 step 2){
//        println(x)
//    }
//
//    println()
//
//    for (x in 12 downTo 0 step 3){
//        println(x)
//    }
//}

//end of ranges

//start of collections
//fun main(){
//    val students = listOf("wonder","spider","seth","vivian")
//    for (studentName in students)
//        println(studentName)
//}

//to see if a collection contains an object
//fun main(): Unit {
//    val students = listOf("wonder","spider","seth","vivian")
//    when{
//        "wonder" in students -> println("stubborn")
//    }
//    when{
//        "spider" in students -> println("he is a womanizer")
//    }
//}

//using lambda expressions
//fun main(): Unit {
//    val students = listOf("wonder", "spider", "seth", "vivian")
//    students
//        .filter { it.startsWith("s") }
//        .sortedBy { it }
//        .map { it.uppercase() }
//        .forEach { println(it)}
//}

// end of lambda expression

//start of type checks and automatic casts
//fun getStringLength(obj: Any): Int? {
//    if (obj is String){
////        obj is automatically cast to string in this second branch
//        return obj.length
//    }
//    return null
//}
//
//fun main(): Unit {
//    fun printLength(obj: Any){
//        println("Getting the length of '$obj'.Result:${getStringLength(obj)?: "Error: The object is not a string"}")
//    }
//    printLength("Thisislookingfuckedup")
//    printLength(1000)
//    printLength(listOf(Any()))
//}

//end of type checks

fun main(): Unit {
var welcomeMessage = "Hello and welcome to Kotlin"
when (welcomeMessage.length){
    0 -> println("Nothing to say?")
    in 1..50 -> println("Perfect")
    else -> println("Too long")
}
    pt1()
    println()
    pt2()
}

fun pt1(): Unit {
var firstString = "trout"
var secondString = "haddock"
var thirdString = "snapper"

println("I like $firstString , $thirdString  and $secondString")
}

fun pt2(): Unit {
    var statementIs = "This is a random string"
    when (statementIs.length){
        0 -> println("error message")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }
}