package studay3

fun main(args:Array<String>)
{
    var i=0;
    while(i<100)
    {
        println("hello"+(++i))
    }
    do {
        println("hello:"+(--i))
    }while (i>0)
}