package studay9
@Target(AnnotationTarget.CONSTRUCTOR)
annotation class AnotationTest5
class UserInfo @AnotationTest5 constructor (args:String,passwrod:String)
{

}
fun main(args:Array<String>)
{
    var test=Test4()
    println(test.function1("44"))
}