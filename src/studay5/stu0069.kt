package studay5

open class C

class D: C()

fun C.foo() = "c"

fun D.foo() = "d"

fun printFoo(c: C) {
    println(c.foo())//二选一
}
/*
fun printFoo(c: D) {
    println(c.foo())//二选一
}
*/
fun main(args:Array<String>)
{
    printFoo(D())
}
