package studay9

import studay5.User

fun main(args:Array<String>)
{
    var user=User()
    var str=user?.username?.length
    println(str)
}