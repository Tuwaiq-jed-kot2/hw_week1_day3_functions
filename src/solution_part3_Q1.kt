//Mathematical Operations

fun main() {
    print(math(2,3))
}

fun math (num1 : Int , num2 : Int) {
    println("Add : ${Add(num1,num2)}" )
    println("Subtract : ${Subtract(num1,num2)}" )
    println("Multiply : ${Multiply(num1,num2)}" )
    println("Divide : ${Divide(num1,num2)}" )

}

fun Add(num1 : Int , num2 : Int) : Int = num1 + num2
fun Subtract(num1 : Int , num2 : Int) : Int = num1 - num2
fun Multiply(num1 : Int , num2 : Int) : Int = num1 * num2
fun Divide(num1 : Int , num2 : Int) : Int = num1 / num2

