package studay3

fun main(args:Array<String>)
{
    var number=1000;
    println(number.shl(1))
    println(number.shl(2))
    println(number.shl(3))
    println(0b111.and(0b101))//101
    println(0b111.or(0b101))//111
    println(0b111.xor(0b101))//010
    println(0b00.inv())//00  0
    println(0b01.inv())//01  1
    println(0b10.inv())//11  -1
    println(0b11.inv())//10  0
    println((-10).inv())
}