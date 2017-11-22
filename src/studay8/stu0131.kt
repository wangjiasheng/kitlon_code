package studay8
fun convert3(any:Any)
{
    if(any !is String || any.substring(3).length>0)//自动转换字符串
    {

    }
}
fun convert4(any:Any)
{
    if(any is String && any.substring(3).length>0)//自动转换字符串
    {

    }
}
fun convert5(any:Any)
{
    when
    {
        any is String-> println(any.substring(2).length>0)
        any is Int-> println(any)
    }
}
fun main(args:Array<String>)
{

}