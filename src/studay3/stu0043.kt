package studay3

import java.util.*

fun main(args:Array<String>)
{
    var s=Scanner(System.`in`);
    var i=s.nextInt();
    when(i)
    {
        in 1..10-> println("0-10");
        in 11..20-> println("11-20");
    }
}