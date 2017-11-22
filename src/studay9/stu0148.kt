package studay9
@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class AnotationTest6
class UserInfo2
{
    var username:String
       @AnotationTest6 set(value) {}
        get() =""
}
fun main(args:Array<String>)
{
    var test=Test4()
    println(test.function1("44"))
}