package studay6

//匿名类内部类
interface ObserverSuper
{
    fun onClickListener();
}
class ObserverFun
{
    var sper:ObserverSuper?=null;
    fun setOnClickListener(sper:ObserverSuper)
    {
        this.sper=sper;
    }
    fun printlinfo()
    {
        if(sper!=null)
        {
            sper!!.onClickListener();
        }
    }
}
fun main(args:Array<String>)
{
    var sb=ObserverFun();

    sb.setOnClickListener(object: ObserverSuper {
        override fun onClickListener() {
           println("哈哈")
        }
    })
    sb.printlinfo();
}