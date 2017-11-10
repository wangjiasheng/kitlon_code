package studay1

fun anyParam(any:Any):Unit
{
    if(any is Int) {
        println("Int");
    }
    else if(any is String) {
        println("String");
    }
    else if(any !is Boolean)
    {
        println("not Boolean");
    }
    else
    {
        println("boolean")
    }
}
fun main(args:Array<String>):Unit
{
    anyParam(1);
    anyParam("hello");
    anyParam(Float.javaClass)
    anyParam(true)
}