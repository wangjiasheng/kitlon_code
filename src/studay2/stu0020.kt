package studay2

fun String.helloword(args1:String, args2:String):String  //扩展函数 扩展String方法
{
    return "$args1:$args2";//字符串拼接
}
fun main(args:Array<String>)
{
    var str=String();
    var hello=str.helloword("我去","哈哈");//调用扩展的helloword
    println(hello);
}