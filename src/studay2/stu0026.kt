package studay2
fun whentest(color:String):Any
{
    return when(color)
    {
        "red"->true;
        "str"->"str"
        "yellow"->"num"
        else->"未知";
    }
}
fun main(args:Array<String>)
{
    println(whentest("red"));
    println(whentest("yellow"));
    println(whentest("str"));
}