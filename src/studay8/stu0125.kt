package studay8

fun main(args:Array<String>)
{
    for(x in 0..10 step 2)
    {
        println(x)
    }
    println("------------------------")
    for(y in 10 downTo 0 step 2)
    {
        println(y)
    }
    println("------------------------")
    for(z in 0 until 5)
    {
        println(z)
    }
}