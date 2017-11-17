package studay6

open class A
{
    open fun println(str: String="卧槽")
    {

    }
}
class B:A()
{
    override fun println(str: String) {  //当覆盖一个带有默认参数值的方法时，参数必须省略默认值
        super.println(str)
    }
}