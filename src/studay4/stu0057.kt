package studay4

open class Base20
{
    open var int:Int=10;
}
open class Base21:Base20()
{
    override var int: Int=100
}
fun main(args:Array<String>)
{
    var base=Base21();
    println(base.int)
}