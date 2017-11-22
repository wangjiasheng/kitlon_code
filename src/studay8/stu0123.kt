package studay8

fun main(args:Array<String>)
{
    var maplist= mapOf<String,Int>("username" to 100 ,"password" to 200)
    println(maplist["username"])
    var maplistcon:Map<String,Int> = HashMap<String,Int>(maplist);
}