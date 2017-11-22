package studay8

fun main(args:Array<String>)
{
    var list:MutableList<Int> = mutableListOf<Int>(1,2,4);
    var readonly:List<Int> = list
    println(list)
    list.add(4)
    println(readonly)

}