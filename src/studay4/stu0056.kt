package studay4

open class Base16
{
    open fun println(args:String)
    {

    }
}
open class Base17:Base16()
{
    open override fun println(args: String) {
        super.println(args)
    }
}
open class Base18:Base16()
{
    final override fun println(args: String) {
        super.println(args)
    }
}
class Base19:Base17()//能集成17不能继承18
{
    override fun println(args: String) {
        super.println(args)
    }
}