fun main() {
// Question 3


}

val printMax : () -> Unit = {

    val n1 = 6
    val n2 = 8
    val n3 = 3

    val printMax : () -> Unit = {
        if (n1 >= n2 && n1 >= n3)
            println("$n1 is highestScore")

        else if (n3 >= n1&& n2 >= n3)
            println("$n2 is highestScore")
        else println("$n3 is  highestScore")
    }
