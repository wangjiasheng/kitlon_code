package studay8

fun main(args:Array<String>)
{
    var range=0.rangeTo(6);
    for(x in range step 2)
    {
        println(x)
    }

    var s=1.1.rangeTo(1.7); //Float Double不能定义他们的操作符

    for(x in 6.downTo(0) step 2)
    {
        println(x)
    }

}