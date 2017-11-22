package studay9

import studay5.User

fun main(args:Array<String>)
{
    var str:String?=null
    var s=  str?.length?:-1//安全检测
    println(s)
}