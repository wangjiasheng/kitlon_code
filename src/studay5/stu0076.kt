package studay5
//为数据类生成的 Component 函数
data class Clazz(var name:String = "username",var passwd:String="password")
{

}
fun main(args:Array<String>)
{
    var test=Clazz("username","password");
    val (named, passwd) = test;
    println("$named  $passwd")
}
