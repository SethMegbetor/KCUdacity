package aquarium.decorations

fun main() {
    makeDecorations()
}

fun makeDecorations(){
    val d1 = Decorations( rocks: "granite")
    println(d1)
}

data class Decorations(val rocks: String){}