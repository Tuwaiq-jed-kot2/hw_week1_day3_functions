/*---------------------------------------Part II ------------------------------------------*/
/*Q:Create an anonymous function called maximum() that takes three number as input and return the largest one of these numbers.
fun main() {
    println(maximum(10,14,12))
}
Output: "The largest number is 14"*/

fun main() {
    println(maximum(10,14,12,myLambda1))
}
fun maximum(number1:Int, number2:Int, number3:Int, myFun:(Int, Int, Int)->Int):Int {
     number1
     number2
     number3

return myLambda1(number1,number2,number3)
}

val myLambda1:(Int,Int,Int)->Int={number1,number2,number3 -> if (number1 > number2 && (number1 > number3))  number1
else if (number2 > number1 && (number2 > number3))  number2
else  number3
}

/*---------------------------------------Part III ------------------------------------------*/
/*Q:Create a function called math() that takes two input numbers and that will do Add,
 Subtract, Multiply, and Divide between these two numbers, and return the operator's name with its result.

fun main() {
    println(math(2,3))
}
Output:
Add: 5
Subtract: -1
Multiply: 6
Divide: 0
*/
//fun main(){
//math(2,3)
//}
//fun math(number1:Int,number2:Int){
//    val sub = number1-number2
//    println("Subtract: $number1-$number2=$sub")
//
//    val multi=number1*number2
//    println("Multiply: $number1*$number2=$multi")
//
//    val add= number1+number2
//    println("Add: $number1+$number2=$add")
//
//    val div=number1 / number2
//    println("Divide: $number1/$number2=$div")
//}
