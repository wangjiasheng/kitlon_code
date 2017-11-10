package studay2
fun helloworld():Int
{
   var math=1/0;
    return math;
}
fun main(args:Array<String>)
{
    var hello=try {
        helloworld();
    }
    catch (exception :ArithmeticException)
    {
         3
    }
    println(hello);
}