import java.util.Scanner

fun main(){
    val reader = Scanner(System.`in`)

    println("Your first name: ")
    val fName = reader.nextLine()
    println("Your middle name: ")
    val mName = reader.nextLine()
    println("Your last name: ")
    val lName = reader.nextLine()
    println("Welcome " + fullName(fName,mName,lName))

    print("Enter first number: ")
    val inNum1:Int = reader.nextInt()
    print("Enter second number: ")
    val inNum2:Int = reader.nextInt()
    println("$inNum1 + $inNum2 = " + add(inNum1,inNum2))

}
fun add (num1:Int, num2:Int):Int{
    return num1+num2
}

fun fullName(firstName:String, middleName:String, lastName:String):String{
    return "$firstName $middleName $lastName"
}