package studay3

fun main(args:Array<String>)
{
    test@ for(x in 1..10)
    {
        println("$x")
        ok@for(y in 10..20)
        {
            println("$x:$y")
            break@test
        }
    }
}