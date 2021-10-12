fun main(){
    //### Question 1
    println(add(10,12))

    divider()
    //### Question 2
    print(fullName("Ahmed","Abdullah","Al Waleed"))
}

//### Question 1
fun add(firstNumber:Int, secondNumber:Int):Int {
    return firstNumber + secondNumber
}

//### Question 2
fun fullName(firstName: String, middleName: String, lastName: String):String {
    return "$firstName $middleName $lastName"
}

fun divider(){
    print("\n\n#####################################################\n\n")
}