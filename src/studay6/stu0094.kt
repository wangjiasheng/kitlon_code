package studay6
interface text
{
    fun test():String
}
object obj:text
{
    override fun test():String {
        return "test";
    }
}
fun main(args:Array<String>) {
    println(obj.test().hashCode());
    println(obj.test().hashCode());
    println("234".hashCode())
    println("234".hashCode())
}