fun main(){
    val items = listOf("apple", "banana","kiwifruit")
    for (item in items){
        println(item)
    }
    println()
    students()
}

fun students(): Unit {
    val incubation = listOf("wonder","vivian","albert")
    for (index in incubation.indices)
        println("student at $index is ${incubation[index]}")
}