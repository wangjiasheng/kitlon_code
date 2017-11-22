package studay8

import studay5.printl

class Conn {
    val _items = mutableListOf<Int>(2, 4, 6, 8, 99)
    val items: List<Int> get() = _items.toList() //get()返回一个快照必须val
    var item: List<Int> = items.toList();
}

fun main(args: Array<String>) {
    var list = listOf<Int>(1, 3, 5, 7, 9)
    println(list.first())
    println("------------------------------");
    println(list.last())
    println("------------------------------");
    list.filter { j -> j > 0 }.forEach(){println(it)}
    println("------------------------------");
    list.filter { it % 2 > 0 }.forEach(){println(it)}
}
