fun main(){
println(add(20,30))
    fullName()
    fullName1("Bashayer","Ismaeel","Alhawsawi")
}


fun add (num1:Int,num2:Int):Int{
    return num1+num2
}
//-----Q2----
fun fullName() {
   println("inter Your First name!!")
    val fName= readLine()
    println("Enter your Second name")
    val mName= readLine()
    println("Enter your last Name!!")
    val lName= readLine()
     println("welcome $fName $mName $lName to this bootcamp")
}
//---Another way-------
fun fullName1(first:String,middele:String,last:String){
    println("welcome again $first $middele $last")
}
