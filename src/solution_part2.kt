fun main() {
    println(fullName("Eman","Jameel","Samkri"))

    //part2 optional
    println(maximum(10,14,12))
}

fun fullName (fName : String, midName : String, LName : String): String {
    return "$fName $midName $LName"
}
val maximum: (num1:Int, num2:Int, num3:Int) -> String = {num1,num2,num3 ->
    if (num1 > num2 && num1 > num3) {
        "The largest number is $num1"
    } else if (num2 > num3) {
        "The largest number is $num2"
    } else {
        "The largest number is $num3"
    }

}