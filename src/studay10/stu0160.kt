package studay10

import kotlin.reflect.KFunction2

fun add(i:Int):Boolean
{
    return i>0;
}
fun add(i:String):Boolean
{
    return i.equals("mm")
}
fun main(args:Array<String>)
{
    println(listOf<Int>(-2,-1,0,1,2,3,4).filter(::add)) // 将一个函数作为参数
    println(listOf<String>("mm","nn").filter(::add))

    var friend:(Int)->Boolean=::add
    println(friend(3))
}
