fun main() {

    maximum(15, 5 , 8)

}

val maximum : (n1:Int, n2:Int, n3:Int) -> Unit = {  num1, num2, num3 -> Int

    if (num1 >= num2 && num1 >= num3){
        println("the greatest number is $num1")
    }else if (num2 >= num1 && num2 >= num3){
        println("the greatest number is $num2")
    } else {
        println("the greatest number is $num3")
    }
}