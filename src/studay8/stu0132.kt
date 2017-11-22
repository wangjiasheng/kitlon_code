package studay8

import studay7.foo

class A
{
    inner class B
    {
        fun Int.foo()
        {
            val a=this@A
            val b=this@B
            val c=this//代表调用的数字
            val d=this@foo
            val funLit=lambda@fun String.()
            {
                val e=this;
                println(e)
            }
            val funList2={s:String->
                val f=this;
                println(f)
            }
            println(a)
            println(b)
            println(c)
            println(d)
            funLit("hello")
            "hello".funLit()
            funList2("word")
        }
        fun test(int:Int)
        {
            int.foo();
        }
    }
}
fun main(args:Array<String>)
{
    A().B().test(4);
}