fun main() {
    print("Type the first number: ")
    val first = Integer.valueOf(readLine())
    print("Type the second number: ")
    val second = Integer.valueOf(readLine())
    math(first, second)
}


fun math ( num1:Int , num2:Int ) {
    print("add ")
    println(num1 + num2 )
    print("subtract ")
    println(num1 - num2 )
    print("divide ")
    println(num1 / num2 )
    print("multiply ")
    println(num1 * num2 )

}