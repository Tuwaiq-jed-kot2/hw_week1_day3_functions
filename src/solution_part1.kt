fun main(){
    theResult()//Q1
    println(fulName("Ahmad","Abdullah","AL waleed"))//Q2
}
fun theResult(){
    print(addNumber(10,12))

}
fun addNumber(num1:Int,num2:Int):Int{//Q1
    return num1+num2
}

fun fulName(FirstName:String,midName:String,lastName:String):String{//Q2
    return("$FirstName $midName $lastName")
}
