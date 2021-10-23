fun main(){

    math()



}
fun math(){
    println(adding(3,4))
    println(sub(3,4))
    println(mult(3,4))
    println(div(3,4))
}

fun adding (num1: Int , num2: Int):Int{
    print("add = ")
    return  num1+num2

}

fun sub (num1: Int , num2: Int):Int{
    print("subtract = ")
    return num1-num2
}

fun mult (num1: Int , num2: Int):Int{
    print("multiply = ")
    return num1*num2
}

fun div (num1: Int , num2: Int):Int{
    print("divide = ")
    return num1/num2
}
