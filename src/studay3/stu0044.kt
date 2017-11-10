package studay3
fun is_function(any:Any)=when(any)
{
    is String-> "String";
    is Int->1;
    else-> "notknow";
}
fun main(args:Array<String>)
{
    println(is_function("S"))
    println(is_function(1))
    println(is_function(1L))
}