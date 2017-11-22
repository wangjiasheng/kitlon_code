package studay8
fun convert1(any:Any)
{
    if(any is String)
    {
        println(any.length)
    }
}
fun convert2(any:Any)
{
    if(any !is String)
        return;
    println(any.length)
}
fun main(args:Array<String>)
{
    convert1 ("34343434");
    convert2("34343434");
}