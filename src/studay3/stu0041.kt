package studay3
fun calc(char:Char)
{
    if(char in '0'..'9')
    {
        println("$char")
    }
    var i=char.toInt()+'0'.toInt();  // Explicit conversions to numbers
    println(i)
}
fun main(args:Array<String>)
{
  calc('1');
}