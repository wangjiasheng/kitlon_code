package studay10
var username="UserName"
//属性和方法的引用
fun main(args:Array<String>)
{
    println(username)
    println(::username)
    println(::username.get())
    ::username.set("我操")
    println(username)

}