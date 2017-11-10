package studay2
fun shen(int:Int):IntArray
{
    return IntArray(int).apply { fill(-1) }
}
//代码风格生成器
fun main(args:Array<String>)
{
    var str= shen(10);
    str.forEach { println(it) }
}