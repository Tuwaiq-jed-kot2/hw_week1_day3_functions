fun main(){
    println(add(10,12))
    println(fullName("Ahmed","Abdullah","Al Waleed"))
}
//Q1
fun add(num1:Int,num2:Int):Int{
    return num1 + num2
}

//Q2
fun fullName(first:String,middle:String,last:String):String{
    return("$first $middle $last")
}