package studay7

//sambda表达式匿名函数
fun main(args: Array<String>) {
    var s1 = fun(x: Int, y: Int): Int = x + y
    println(s1(2, 30))

    var s2=fun(x:Int,y:Int):Int
    {
        return x+y;
    }
}