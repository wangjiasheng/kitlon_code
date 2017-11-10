package studay5

public class MYTest
{
    lateinit var args:String;
    fun setUp()
    {
        args="Hello"
    }
    fun getStr():String
    {
        return "hello"
    }
}
fun main(args:Array<String>)
{
    var test=MYTest();
    test.setUp()
    println(test.args)
}