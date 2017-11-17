package studay6
class Function1
{
    private fun fun1()=object
    {
        var x:Int =100;
    }
    public fun fun2()=object
    {
        var x:Int=100;
    }
    fun test()
    {
        println(fun1().x)
        println(fun2());//不能访问x
    }
}