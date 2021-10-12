fun main(){
    val num1:Int = 5            //### Question 1 solution
    val num2:Int = 10           //### Question 1 solution
    println(add(num1,num2))     //### Question 1 solution

    println("Enter yore first name")        //### Question 2 solution
    val fName = readLine()                  //### Question 2 solution
    println("Enter yore middle name")       //### Question 2 solution
    val mName = readLine()                  //### Question 2 solution
    println("Enter yore last name")         //### Question 2 solution
    val lName = readLine()                  //### Question 2 solution
    println(fullName(fName,mName,lName))    //### Question 2 solution
}

fun add(number1: Int, number2:Int): Int = number1 + number2 //### Question 1 solution

fun fullName(fName:String?,mName:String?,lName:String?):String=fName+" "+mName +" "+lName //### Question 2 solution
