package studay6
//匿名对象直接创建对象
fun main(args:Array<String>)
{
    var test=object
    {
        var x:Int =20;
        var y:Int =10;
    }
    println(test.x)
    println(test.y)
}