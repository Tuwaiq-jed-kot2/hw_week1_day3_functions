//part2

    fun main() {
   maximum()
    }
    fun maximum (){
        println(numbers(10, 12, 14))}

    fun numbers(num1:Int,num2:Int,num3:Int) {
    if (num1>num2)

    { println("this numer is largest")}
        else if (num1<num2 ==true){
          println("this num is largest")

        } else if (num1<num3==true){
            println("this num is larg")
        }else if (num1>num3==true) {
            println("this num is largest")
        } else if (num2<num3== true){
            println("this num is largest")

        }else if (num2>num3== true){
            println("this num is largest")

        }
    }



//Create a function called `math()` that takes two input numbers and that
// will do Add, Subtract, Multiply, and Divide between these two numbers, and return the operator's
// name with its result.

fun Math (x:Int,y:Int):Int{
    return x * y


}
fun Math0(x:Int,y:Int):Int {
    return x - y
}
fun Math1(x:Int,y:Int):Int {
    return x / y
}
fun main() {
    val x=0
    val y=0
    println(Math(6,2))
    println(Math0(6,2))
    println(Math1(6,2))


}
