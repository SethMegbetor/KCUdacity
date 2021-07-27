//fun add(a:Int, b:Int): Int{
//    return a + b
//}
//
//fun div(c:Int, d:Int): Int{
//    return c / d
//}
//
////inferred function
//fun mul(e:Int,f:Int)=e*f
//
////return type omitted
//fun printSub(g:Int,h:Int){
//    println("sum of $g and $h is ${g - h}")
//}

val PI = 3.14
var x = 0

fun incrementX(){
    x += 1
}

fun main(){
//    println("the sum of 4 and 5 is: ")
//    println(add(4,5))
//    println()
//    println("The division of 4 and 5 is: ")
//    println()
//    println("The multiplication of 4 and 5 is ${mul(4,5)}")
//    println()
//    printSub(3,4)
//    println()

    //variables
    val x:Int = 1
    val y = 2
    val z: Int
    z = 3

    var m = 5
    m += 1

    println("x = 4x; PI=$PI")
    incrementX()
    println("incrementX()")
    println("x = $x; PI = $PI")
}

