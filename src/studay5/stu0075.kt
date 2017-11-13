package studay5

//数据类
data class Sun(var color:String = "",var orientation:String = "")//赋值默认值才有无参构造方法
{
   fun test()= Sun()
}
fun main(args:Array<String>)
{
    var sum=Sun("12","33");
    var s=sum.copy("44","332")
    var sd=Sun();
    println(s.color)
    println(s.orientation)
    println(sum.javaClass)
    println(s.javaClass)
    println(s)
}