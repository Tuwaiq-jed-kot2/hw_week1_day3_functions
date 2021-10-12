var num1 = 0
var num2 = 0
var num3 = 0


fun main() {
    print("Type the first number: ")
    val number1 = Integer.valueOf(readLine())
    print("Type the second number: ")
    val number2 = Integer.valueOf(readLine())
    print("Type the third number: ")
    val number3 = Integer.valueOf(readLine())
    num1 = number1
    num2 = number2
    num3 = number3
    maximum (num1 , num2 ,num3)
}



val maximum:(num1:Int , num2:Int , num3:Int) -> Unit = {
        num1: Int, num2: Int, num3: Int ->
    if (num1 > num2 ){
        if(num1 >num3){
            println("the largest number is $num1")
        }else if (num3 > num1 ){
            println("the largest number is $num3")
        }
    }
        else if (num2 > num3){
            println("the largest number is $num2")
        }
    else if (num3 > num2 ) {
        println("the largest number is $num3")
    }
    else println("wrong input")
    }