import java.util.*
import kotlin.concurrent.schedule
fun main(){
    //### Question 3
    println(maximum(10,14,12))

    divider()
    //### Challenge 1: Mathematical Operations
    println(math(2,3))

    divider()
    //### Challenge 2: Fireball Fuel Level
    val fuelLevel = (0..50).random()
    val numOfFireball = (1..5).random()
    println("Fuel Level: $fuelLevel%")
    //To make it understandable:
    println("Number Of Fireball: $numOfFireball")
    castFireball(numOfFireball, fuelLevel)
}

//### Question 3
val maximum:(firstNum: Int, secondNum: Int, thirdNum: Int) -> Int = { first: Int, second: Int, third: Int ->
    val largest: Int
    if (first > second && first > third) largest = first
    else if (second > first && second > third) largest = second
    else largest = third

    largest
}

//### Challenge 1: Mathematical Operations
fun math(firstNum: Int, secondNum: Int): String {
    return "Add: ${firstNum+secondNum} \nSubtract: ${firstNum-secondNum} \nMultiply: ${firstNum*secondNum} \nDivide: ${firstNum/secondNum}"
}


//The code generates a random fuel level and a random fireballs count
//based upon that he check if the fuel is enough to lunch all fireballs
//if not he lunches as many as the fuels allows
//assuming that each fireball casting requires 10% of fuel
private fun castFireball(numOfFireball: Int, fuelLevel: Int){
    var i = 0
    var fuelLevel = fuelLevel
    while (i < numOfFireball){
        if(fuelLevel > 9) {
            println("A fireball springs into existence ---*")
            fuelLevel = fuelLevel - 10
        } else {
            println("Fuel Level Is Low, Refill To Cast Fireballs")
            break
        }
        i++
    }
    fuelLevelStatus(fuelLevel)
}
private fun fuelLevelStatus(fuelLevel: Int) {

    val status = when (fuelLevel) {
        in 41..50 -> "full"
        in 31..40 -> "good"
        in 21..30 -> "low"
        in 11..20 -> "fumes"
        in 1..10 -> "empty"
        else -> "none"
    }

    println("Status: $status ($fuelLevel%)")
}
