fun main(){
   findMax()
}

fun findMax(list: List<Int>): Int? {
   return list.max()
}


         val list = listOf(10, 12, 14)

         val max = findMax(list)
         println(max)
