fun main(){
    resulth()
}
fun resulth (){
    println("add  :" +add(2,3))
    println("subtact :" +sub(2,3))
    println("Mattiply:" +mal(2,3))
    println("Divide :" +div(2,3))
}

fun add(num1:Int,num2:Int):Int{
    return num1+num2
}
fun sub(num1:Int,num2:Int):Int{
    return num1-num2
}fun mal(num1:Int,num2:Int):Int{
    return num1*num2
}fun div(num1:Int,num2:Int):Int{
    return num1/num2
}