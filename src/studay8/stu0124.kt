package studay8


fun main(args:Array<String>)
{
    var list= listOf<String>("1","2","3","4","5","6","7")
    for(x in 0..list.size-1)
    {
        println(list[x])
    }
    println("--------------------------")
    for(xx in list.size-1 downTo 0)
    {
        println(list[xx])
    }
}