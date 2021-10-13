fun main(){
// حاولت اني ابحث على طريقة تفصل الكلام في Output
    //
    println(fullName("Hind","AbdulBari","Zaki"))

    println(calculatingMin(60,5))
    println(calculatingMin(60,12))

}
// Q1
// instead of adding I used calculating
fun calculatingMin ( minute : Int, hour :Int): Int {

    return minute* hour
}
//Q2
internal fun fullName ( firstName: String,midName: String, lastName: String): String{
    return firstName+ midName+lastName
}




