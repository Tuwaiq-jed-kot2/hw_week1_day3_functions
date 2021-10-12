fun main(){
println(fullName(firstName = "   ",middleName = "   ", nameLast = ""))
}
fun fullName(firstName:String,middleName: String,nameLast:String): String? {
    println("Enter You FirstName:")
    val firstName= readLine()
    println("Enter You MiddleName:")
    val middleName= readLine()
    println("Enter You lastName??")
    var nameLast= readLine()
    return firstName +" "+middleName +" "+nameLast
}


