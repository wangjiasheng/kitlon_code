package studay6
//单利伴随对象
class SuperBS
{
    var x:Int =100;
    companion object Factory{   //如果没有写Factory 默认Companion
        fun create():SuperBS=SuperBS();
    }
}

fun main(args:Array<String>)
{
    var sup=SuperBS.create();
    println(sup.x)
}