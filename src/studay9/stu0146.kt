package studay9
@Target(AnnotationTarget.EXPRESSION)
annotation class AnotationTest4
class Test4
{
    fun function1(args:String) :String
    {
        return (@AnotationTest4 args)
    }
}
fun main(args:Array<String>)
{
    var test=Test4()
    println(test.function1("44"))
}