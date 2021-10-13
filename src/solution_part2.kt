fun main(){
    println(math(2,3))
    castFireball(7)
}
//PartII

//val maximum:(Int) -> String ={
//    "The largest number is $it "
//}

//PartIII - Q1
fun math(num1:Int,num2:Int):String {
    val add = num1 + num2
    val sub = num1 - num2
    val mul = num1 * num2
    val div = num1 / num2
    return """
    |Add: $add
    |Subtract: $sub
    |Multiply: $mul
    |Divide: $div
    """.trimMargin()
}
//Q2
fun castFireball(fireball:Int) {
    when(fireball){
        0 -> println("The remaining fuel is: 50")
        1 -> println("The remaining fuel is: 43")
        2 -> println("The remaining fuel is: 36")
        3 -> println("The remaining fuel is: 29")
        4 -> println("The remaining fuel is: 22")
        5 -> println("The remaining fuel is: 15")
        6 -> println("The remaining fuel is: 8")
        7 -> println("The remaining fuel is: 1")
    }
}