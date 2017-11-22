package studay9

import studay7.printlnNode


annotation class Suspendable

fun userinfo(username: String, age: (args:Int,arg:Int) -> Int){
    println(username)
    var value=age(200,300)
    println(value)
}

fun main(args: Array<String>) {
    userinfo(username = "username", age = @Suspendable
    { i: Int, i1: Int ->
        println(i)
        println(i1)
        100
    })
}