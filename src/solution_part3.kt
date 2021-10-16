fun main() {
    println("Challenge 1: Mathematical Operations")
    println(math(2,3))
    println("Challenge 2: Fireball Fuel Level")
    var playerFuel = 50
    while (playerFuel<=50){
        if (playerFuel == 50) {
            println("max level of fuel")
            playerFuel = castFireball(playerFuel)
        }
        else if (playerFuel in 1..49){
            playerFuel = castFireball(playerFuel)
            println("the fuel level is $playerFuel")
        }
        else{
            "tank is empty Game Over"
        }
    }
}

fun math (num1:Int, num2:Int) : String{
  return "add: ${num1 + num2}\n" +
          "Subtract: ${num1 - num2}\n"+
          "Multiply: ${num1 * num2}\n"+
          "Divide: ${num1 / num2}\n"
}

fun castFireball(Fuel:Int) : Int{
    var f = Fuel
    //return f = Fuel -10 // the issues about parameter are final
    return Fuel
}