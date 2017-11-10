package studay3

import java.util.*

fun main(args:Array<String>)
{
    var a=Scanner(System.`in`).nextInt();
    when
    {
        a>0-> println(">0");
        a<0-> println("<0");
       else-> println("=0");
    }

}