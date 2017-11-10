package studay3

fun main(args:Array<String>)
{
    var list= listOf<Int>(1,4,6,8,9)
    for(item:Int in list)//不具备迭代
    {
        print(item)
    }
    list.forEach { print(it) }
}