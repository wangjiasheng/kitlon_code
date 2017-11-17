package studay6
//可能是匿名对象
open class Super(x:Int)
{
    public open val y:Int =x;
}
interface test
{
    open fun test();
}
fun main(args:Array<String>)
{
    var ab:Super=object : Super(1),test{
        override fun test() {

        }
    }
    println(ab.y)
}