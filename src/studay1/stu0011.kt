package studay1

fun main(args:Array<String>)
{
    var a=90;
    if(a in 0..10)
    {
        println("true")
    }
    if(a !in 0..10)
    {
        println("false")
    }
}