package studay6
infix fun Int.shwjs(x:Int):Int
{
    return 2;
}
infix fun Int.sha(x:Int):Int
{
    return 2;
}
fun main(args:Array<String>)
{
    println(1 shl 3)
    println(1.shl(4))
    println(1 shwjs 3)  //如果不加infix 就不能这么写
}