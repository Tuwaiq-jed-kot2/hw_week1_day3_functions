fun main() {

    println(castFireball(32))
}

fun castFireball(fuelVal:Int):String {
    val rFireballs:String = when (fuelVal) {
        in 1..50 -> "Remaining fireballs: $fuelVal"
        0 -> "Remaining fireballs: 0"
        else -> "Game Over!"
    }
    return rFireballs
}