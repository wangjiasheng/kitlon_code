package studay7


data class Person( var username:String,var passwrod:String)
{

}
//对象解构
fun main(args:Array<String>)
{
    val person=Person("wangjiasheng","812330500")
    val (username, passwrod)= person;
    println(username)
    println(passwrod)

    //解构在集合中的使用
    var map= mapOf<String,String>("username" to "wang","password" to "812330500")
    for((x,y)in map)
    {
        println("$x-----$y")
    }
}