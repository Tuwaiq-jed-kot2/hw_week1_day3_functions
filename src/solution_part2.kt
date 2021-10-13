fun main(){
    name()
}
fun name (){
   println(fullName("Bashayer",fathername = "yahya",lastName = "Alzah"))
}
fun fullName(firstName: String,fathername:String,lastName:String):String{
    return "$ firstName $fathername $lastName"
}
