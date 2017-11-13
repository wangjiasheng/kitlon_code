package studay5

class MyClass
{
    companion object {
        fun println()
        {

        }
        fun getInstance():MyClass
        {
           return MyClass();
        }
    }
    fun print()
    {

    }
}
fun MyClass.Companion.printf()
{

}
fun main(args:Array<String>)
{
    MyClass.println();//据说伴随对象相当于静态
    MyClass.printf();
    var test=MyClass();
    test.print();
}