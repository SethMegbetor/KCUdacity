fun main(){
    var a = 1
    var s1 = "a is $a"

    a = 2

    var s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
    println()

    var myName = "seth"
    var c1 = "my name is $myName"

    myName = "spider hussle"

    var c2 = "${c1.replace("is","was")}, but now it is $myName"
    println(c2)
}