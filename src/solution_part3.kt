fun main() {
    println(math(2,3))
}

fun math (num1:Int,num2:Int):String {

    val add = "Add = " + (num1+num2)
    val sub = "Subtract = " + (num1-num2)
    val mul = "Multiply = " + (num1*num2)
    val div = "Divide = " + (num1/num2)

    return "$add\n$sub\n$mul\n$div"
}