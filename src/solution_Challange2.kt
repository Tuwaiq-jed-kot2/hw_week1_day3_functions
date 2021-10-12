fun main() {
    val fireballCasted = 100
    val fuel = 50

    castFireball(fuel , fireballCasted, fuel - fireballCasted)
}


fun castFireball (fuel:Int, fireballCasted:Int, remainingFuel:Int) {
        if (remainingFuel in 1..50){
        println("Fireball casted remaining fuel is $remainingFuel")
    }
    else
        println("insufficient amount of fuel")
}