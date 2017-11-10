package studay2
class Function
{
    fun username()
    {
        println("username")
    }
    fun passwrod()
    {
        println("passwrod")
    }
    fun sex()
    {
        println("sex")
    }
    fun age()
    {
        println("age")
    }
}
fun main(args:Array<String>)
{
    var haha=Function();
    with(haha)
    {
        sex()
        age()
    }
}