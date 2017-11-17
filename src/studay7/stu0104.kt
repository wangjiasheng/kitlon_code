package studay7

import studay5.printFoo

fun main(args:Array<String>)
{
    var int:Int=100;
    fun println() //局部函数
    {
        println(int);
    }
    println();
}
class Fun
{
    fun test() //成员函数
    {

    }
    fun <T> fx(args:T):Unit //泛型函数
    {
    }
}