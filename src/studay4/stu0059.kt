package studay4

open class Extend1
{
    fun print()
    {
        println("print()")
    }
    open fun println()
    {
        println("println()")
    }
}
interface Extend2
{
    fun printf()
    {
        println("printf");
    }
    fun printfln()
    {
        println("printfln");
    }
}
class Extend3():Extend1(),Extend2
{
    override fun printf() {
        super.printf()
        super<Extend1>.print();
        super<Extend2>.printf();
        super<Extend1>.println();
    }
}