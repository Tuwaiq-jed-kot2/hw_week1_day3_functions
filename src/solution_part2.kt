fun main() {                        //### Question 3 solution
    println(max(8,11,9))
}
val max: (Int, Int, Int) -> String = { a, b, c->
    var max: Int = 0
    when {
        a >= b && a >= c -> {
            max = a
        }
        b >= a && b >= c -> {
            max = b
        }
        else -> {
            max = c
        }
    }
    "The Largest Number = $max"
}