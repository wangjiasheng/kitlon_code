package studay8

import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    var list = mutableListOf<Int>(1, 3, 5, 7, 9)
    list.requireNoNulls().forEach() {
        println(it)
    }
    if (list.none { it < 10 }) { //没有值小于10的
        println("yes")
    }
    println("----------------------------")
    var vr=list.firstOrNull();
    println(vr)
}