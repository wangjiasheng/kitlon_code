package studay2
fun iftest(args:Int):String
{
    var str=if(args==1)
    {
        "one"
    }
    else if(args==2)
    {
        "two"
    }
    else
    {
        "thrid"
    }
    return str;
}
fun main(args:Array<String>)
{
    println(iftest(1))
    println(iftest(2))
    println(iftest(3))
}