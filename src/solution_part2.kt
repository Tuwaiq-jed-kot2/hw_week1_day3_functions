fun main() {

    println(maximum(10,140,12))


}

val maximum : (Int, Int, Int) -> Unit ={

        x, y, z -> Int
    if (x >= y && x >= z){ println("The largest number is $x")
    }else if (y >= x && y >= z){
        println("The largest number is $y")
    } else {
        println("The largest number is $z")
    }
}
