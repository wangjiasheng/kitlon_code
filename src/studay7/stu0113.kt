package studay7

import studay5.printl

fun main(args:Array<String>)
{
    var list= listOf<Int>(1,2,4,5,6,6)
    println(list.filter{
        var result=it>0
        result
    })
    //"-------------等价于--------------"
    println(list.filter {
        var result=it>2
        return@filter result
    })

    list.filter(fun(it)=it>0)
}