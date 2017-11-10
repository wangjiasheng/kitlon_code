package studay3

fun main(args:Array<String>)
{
    var number=111_11_2_1;//数字可以用分隔符
    println(number);
    var longnumber=1L;//长整形后面加L
    println(longnumber is Long)
    var hexnumber=0x32//十六进制表示形式
    println(hexnumber)
    var bytenumber=0b11;
    println(bytenumber);
}