package studay7

class Param
{
    fun reformat(userinfo:String,age:Int=27,username:String="",password:String="")
    {

    }
    fun main(args:Array<String>)
    {
        reformat("");//默认参数
        reformat("args",age=1,username="",password="");
        reformat(userinfo="",age=1,username="",password="");
        //在调用 Java 函数时不能使用命名参数语法，因为 Java 字节码并不总是保留函数参数的名称
    }
}