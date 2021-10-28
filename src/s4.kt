fun main(){
println(castFireballs(51))
    println(math(2,3))
    println(fullName("ahmad","Abdullah","Al waleed"))
}
/////////////////
fun math(num1:Int,num2:Int){
    println("Add:"+(num1+num2))
    println("Subtract:"+(num1-num2))
    println("Multiply:"+(num1*num2))
    println("Divide:"+(num1/num2))

}
////////////////
val maximum:(num1:Int,num2:Int,num3:Int)->String={num1, num2, num3 ->
    "the largest number is"+ maxOf(num1, maxOf(num2,num3))  }

//////////////
fun fullName(firstName:String,midName:String,lastName:String):String{
    return "$firstName $midName $lastName"
}
////////////
fun castFireballs(numOfFireball:Int):String{
    var m:String=when(numOfFireball){
       in 1..50->"The fuel value"
        else->"out of rang"
    }

}