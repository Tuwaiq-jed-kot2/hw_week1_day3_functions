fun main(){

    println(math(2,3))
    castFireball(5)
    //println(maximum(10,14,12))
}


    fun math(num1 :Int, num2:Int){
        println("Add : "+(num1+num2))
        println("Subtract : "+(num1-num2))
        println("Multiply : "+(num1*num2))
        println("Divide : "+(num1/num2))
    }

    fun castFireball(numFireballs:Int){
        val result = when (numFireballs){

             1 ->10
             2 ->20
             3-> 30
             4-> 40
             5-> 50
            else -> 0
        }
        println("result is $result")
    }


  // I tried to solve it, but I kinda missed up everything :(
  /*val maximum: (num1:Int,num2:Int,num3:Int)-> Unit ={

       if (num1>num2){
          if (num1>num3){
              println("The largest number is $num1")
          }
          else{
              println("The largest number is $num3")
          }
       }else{
           if (num2>num3){
               println("The largest number is $num2")
           } else
               println("The largest number is $num3")
       }
  }*/
