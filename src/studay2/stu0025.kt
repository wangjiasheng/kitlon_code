package studay2
//如果不为null则执行
fun main(args:Array<String>)
{
    var username= mapOf<String,String>("username" to "wjs","password" to "812330500");
    username["username"]?.let{//  let函数简介http://www.cnblogs.com/duduhuo/p/6934137.html
        println(it)
    }
    println(null?: print("haha"))
    username.let { println(it) }
    username.forEach(){ println(it) }
}