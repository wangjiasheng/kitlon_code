package studay1

fun main(args:Array<String>)
{
    listOf<Int>(1,2,3,4).filter { x->x>2 }.forEach { println("value is $it") }
}