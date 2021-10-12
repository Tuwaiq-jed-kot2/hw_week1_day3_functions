// Part 2 Question 3 (The Largest Number)

fun main() {
    println("Enter The First Number")
    val num1 = Integer.valueOf(readLine())
    println("Enter The Second Number")
    val num2 = Integer.valueOf(readLine())
    println("Enter The Third Number")
    val num3 = Integer.valueOf(readLine())
    println("the Largest Number is " + max(num1,num2,num3))
}

var max : (Int,Int,Int) -> Int = { num1: Int, num2:Int,num3:Int ->
    when{
        num1 >= num2 && num1 >= num3 -> num1
        num2 >= num1 && num2 >= num3 -> num2
        else -> num3
    }
}