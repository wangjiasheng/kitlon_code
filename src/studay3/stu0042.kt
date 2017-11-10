package studay3

fun main(args:Array<String>)
{
    var a:Int=100;
    var b:Int=101;
    var max:Int=-1;

    if(a>b)
    {
        max=a;
    }
    else
    {
        max=b;
    }
    println(max)

    if(a>b)max=b else max=a
    println(max)

    max=if(a>b)a else b;
    println(max)
}