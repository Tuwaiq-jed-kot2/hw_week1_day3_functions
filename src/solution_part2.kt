// Part 2 Question 2 (full name)

fun main(){

    println("Enter The First Name")
    val fName = readLine()
    println("Enter The Middle Name")
    val mName = readLine()
    println("Enter The Last Name")
    val famName = readLine()

    println("The Full Name is : " + fullName(fName,mName,famName))
}

fun fullName(fName: String?, mName: String?, famName: String?) : String{
    return "$fName $mName $famName"
}