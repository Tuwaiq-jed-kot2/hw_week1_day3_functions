fun main() {

    //Q1
    println("Please enter your choice between 1. Sum Numbers 2. Concatenate Full Name 0. to Exit The Loop")

    while (true) {

        val choice = Integer.valueOf(readLine())

        //Q1
        if (choice == 1) {

            println("Please enter 2 numbers to get the sum")

            println("The sum is: " + sum(Integer.valueOf(readLine()), Integer.valueOf(readLine())))

            //Q2
        } else if (choice == 2) {

            println("Please enter your first, middle and last name to combine them")

            println("The full name is: " + fullName(readLine(), readLine(), readLine()))

        } else if (choice == 0) {

            println("Goodbye.")
            break

        }
        else
            println("please choose either 1 or 2 or 0")

    }
}

    //Q1
fun sum(num1: Int, num2: Int): Int {

    return num1 + num2

}

    //Q2
fun fullName(firstName: String?, middleName: String?, lastName: String?): String {

    return "$firstName $middleName $lastName"

}