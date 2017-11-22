package studay9

fun main(args:Array<String>)
{
    var str:List<Int?> = listOf(1,2,3,4,5,null);
    str.forEach(){ println(it)}
    println("----------------")
    str.filterNotNull().forEach { println(it) }
}