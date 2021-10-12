fun main(){
    println(math(2,3))//Q4
    println(castFireball(5.0,3.0))//Q5
}

fun math(num1:Int, num2:Int){//Q4
    println("Add:"+(num1+num2))
    println("Subtract:"+(num1-num2))
    println("Multiply:"+(num1*num2))
    println("Divide:"+(num1/num2))
}
fun castFireball(numOfFireballs:Double,remainingFireballs:Double):Double{//Q5
    return((50-numOfFireballs)*(remainingFireballs))
}