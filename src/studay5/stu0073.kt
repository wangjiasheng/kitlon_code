class BS
class D
{
    fun BS.println()
    {
        println("println2")
    }
    fun print()
    {
        var str=BS();
        str.println();
    }
}
class E
{
    fun BS.println()
    {
        println(toString())
        println(this@E.toString())
    }
    fun print()
    {
        var str=BS();
        str.println();
    }
}
fun main(args:Array<String>)
{
    var test1=E()
    var test2=D();
    var test3=BS();
    test1.print();
}