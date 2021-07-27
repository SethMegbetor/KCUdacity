fun maxOf(a:Int,b:Int):Int{
    return if(a > b){
        a
    }else{
        b
    }
}


fun minOf(x:Int, y:Int):Int{
    return if (x < y){
        x
    }else{
        y
    }
}

fun same(c:Int,d:Int) = if (c > d) c else d

fun main(){
    println("max of 0 and 42 is ${maxOf(0,42)}")
    println()
    println("the minimum of 5 and 4 is: ${minOf(4,5)}" )
    println()
    println("max of 9 and 10 is ${same(9,10)}")
}
