package studay3

fun main(args:Array<String>)//具有迭代功能
{
    var list= listOf<Int>(1,5,7,9,3,45)
    for(item in list.indices)
    {
        println(list[item])
    }
    for(item in list)
    {
        println(item)
    }
}