package studay2
//如果为null则执行
fun main(args:Array<String>)
{
    var maps= mapOf<String,String>("username" to "哈哈","passwrod" to "我操");
    var str=maps["username"]?:throw IllegalStateException("IllegalStateException");
    println(str);
}