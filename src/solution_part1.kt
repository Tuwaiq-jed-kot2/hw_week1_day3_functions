fun main(){
    print("Type the first number: ")
    val first:Int = Integer.valueOf(readLine())
    print("Type the second number: ")
    val second:Int = Integer.valueOf(readLine())

    print("the sum of the two numbers is: ")
    println(add(first, second))
}


fun add (num1:Int,num2:Int): Int {
    return num1 + num2
}