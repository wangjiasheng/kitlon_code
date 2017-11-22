package studay9


open class User1
{

}
class User2:User1()
{

}
fun main(args:Array<String>)
{
    var str:User2= User2();
    var st=str as? String; //安全断言 如果转换不成功则返回Null
    println(st)
}