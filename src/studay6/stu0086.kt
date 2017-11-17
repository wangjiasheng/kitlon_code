package studay6

//Kotlin嵌套类
class SuperClazz
{
    private var test:Int =10;
    class ChildClazz
    {
        fun printlnInfo()
        {
            println("println");
        }
    }
}
fun main(args:Array<String>)
{
   var test= SuperClazz.ChildClazz();
    test.printlnInfo()
}