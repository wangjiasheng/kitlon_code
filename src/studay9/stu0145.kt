package studay9
@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class AnotationTest3
class Test3
{
    fun function1(@AnotationTest3 args:String)
    {

    }
}