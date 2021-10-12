//Part 1 Question 1 (add two numbers)

fun main(){
    println("Enter The First Number")
    val num1 = Integer.valueOf(readLine())
    println("Enter The Second Number")
    val num2 = Integer.valueOf(readLine())
    println("$num1 + $num2 = " + add(num1,num2))

}

fun add(num1 : Int , num2 : Int) : Int {
    return num1 + num2
}