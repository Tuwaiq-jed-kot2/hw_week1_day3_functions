import kotlin.system.exitProcess

var myFireballs = 50

fun main(){

    //Q3
   println("The largest number is: " + maximus(5, 6, 7))

    //Challenge 1

   println(math(2, 3))

    //Challenge 2

    while (myFireballs > 1) {
        println(castFireball(Integer.valueOf(readLine())))
    }
}

    //Q3
val maximus: (Int, Int, Int) -> Int = { num1, num2, num3 ->

    maxOf(num1, num2, num3)

}

   //Challenge 1

fun math(num1: Int, num2: Int): String {

    val add = num1 + num2
    val subtract = num1 - num2
    val multiply = num1 * num2
    val divide = num1 / num2

    return " Add: $add \n Subtract: $subtract \n Multiply: $multiply \n Divide: $divide"
}

   //Challenge 2


fun castFireball(useFireball: Int): Int{

//    val maxFireball= 50
//    val minFireballs = 1


        if(useFireball <= myFireballs) {

            myFireballs -= useFireball

        } else {
            println("The number of fireball you want to cast exceeds the amount you have.")
            exitProcess(0)
        }


    return myFireballs
}