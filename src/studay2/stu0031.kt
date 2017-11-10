package studay2
fun sum_new(color:String):Int=when(color){
    "red"->1
    else->2
}
fun sum_new2(color:String)=when(color)
{
    "red"->1
    else->2
}
fun main(args:Array<String>)
{
    println(sum_new("red"))
    println(sum_new("yellow"))
    println(sum_new2("red"))
    println(sum_new2("yellow"))
}