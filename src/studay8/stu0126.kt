package studay8


fun main(args:Array<String>)
{
  var str:IntProgression=  IntProgression.fromClosedRange(1,6,2);
    println(str)
    for(x in str)
    {
        println(x);
    }
}