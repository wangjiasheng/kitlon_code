package studay3

fun main(args:Array<String>)
{
    var list= mapOf<String,String>("username" to "314232332" , "password" to "812330500")
    for((x,y) in list)
    {
        println("key is $x , value is $y")
    }
}