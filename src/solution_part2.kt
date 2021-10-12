fun main(){
    println(maximum(10,14,12))//Q3
}
val maximum:(n1:Int,n2:Int,n3:Int)->String={n1,n2,n3->"the largest number is " + maxOf(n1,maxOf(n1,n2))
}
