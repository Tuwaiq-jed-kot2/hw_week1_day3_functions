fun main(){
    print("type the first name: ")
    val first:String = readLine().toString()
    print("type the middle name: ")
    val middle = readLine().toString()
    print("type the last name: ")
    val last = readLine().toString()
    print("the full name is: ")
    fullName(first, middle, last)
}

fun fullName (first:String , second:String, last:String) {
    println("$first $second $last ")
}
