package studay8

import studay2.helloworld

//解构参数类型
fun main(args:Array<String>)
{
    var map= mapOf<String,String>("username" to "314232332","password" to "812330500");
    println("-------------参数方式打印------------------")
    map.mapValues { entry -> println("${entry.value}") }
    println("-------------解构方式打印------------------")
    map.mapValues { (key,value)-> println("$value!") }
    println("-------------解构单独参数类型------------------")
    map.mapValues { (_,value:String)-> println("$value") }
    println("------------解构整个参数类型-------------------")
    map.mapValues { (keh,value):Map.Entry<String,String> -> println("$value") }
}