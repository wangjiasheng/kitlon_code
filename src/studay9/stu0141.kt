package studay9

import studay5.User

fun main(args:Array<String>)
{
    var user=User();
    var s = user.username?:throw IllegalArgumentException("username required")
    println(s)
}