package studay1

fun getStr(str:String):Int?
{
    return str.toIntOrNull();//如果是数字那么返回数值否则返回null
}
fun main(args:Array<String>)
{
    println(getStr("3"));
}