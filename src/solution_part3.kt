fun main() {
    math(100,10)
}
fun math (num1 : Int , num2 : Int ) :Int {

    fun add (num1: Int , num2: Int) : Int =(num1+num2)
    fun Minus (num1: Int , num2: Int) : Int =(num1-num2)
    fun MultiPlied (num1: Int , num2: Int) : Int= (num1*num2)
    fun Divided (num1: Int , num2: Int): Int = (num1 / num2)
    print("Add:")
    println((add(num1,num2)))

    print("Subtract:")
    println((Minus(num1,num2)))

    print("Multiply:")
    println((MultiPlied(num1,num2)))

    print("Divide:")
    println((Divided(num1,num2)))
return num1;num2
}