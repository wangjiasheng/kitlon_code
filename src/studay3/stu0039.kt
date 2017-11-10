package studay3

fun main(args:Array<String>)
{
    var number1:Int?=100;
    var number2:Long?=number1?.toLong();
    println(number2);
    var number3:Int?=number2?.toInt();
    println(number3)
}