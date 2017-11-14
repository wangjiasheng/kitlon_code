package studay5

import wjava.Test


abstract class Test1<out T>
{
   abstract fun print():T
    fun test(args:Test1<String>)
    {
        var obj:Test1<Any> = args;
    }
}
abstract class Test2<in T>
{
    abstract fun compareTo(other: T): Int
    fun test(args:Test2<Number>)
    {
        args.compareTo(1.0)
        val obj1:Test2<Double> = args // OK！
        val obj2:Test2<Int> = args // OK！
    }
}
fun main(args:Array<String>)
{

}