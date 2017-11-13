package studay5
fun Any.toString1():String
{
    if(this==null)
        return "null";
    println(this)
    return toString();
}
fun main(args:Array<String>)
{
    var str=Any();
    println(str.toString1());

}