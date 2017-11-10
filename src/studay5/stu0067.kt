package studay5

open class Visiable1
{
    private val username:String?=null;
    open protected val password:String?=null;
    internal  var age:Int=10;
    protected var test:String?=null;
    protected class Child
    {
        public var address:String?=null;
    }
}
class Child1:Visiable1()
{
    override val password: String?
        get() = super.password
}
class Child2 private constructor(args:String)
{

}
fun main(args:Array<String>)
{
    var test=Child1();

}