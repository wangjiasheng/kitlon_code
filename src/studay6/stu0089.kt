package studay6
//枚举
enum class EnumItem
{
    NORTH,SOUTH,WEST,EAST
}
//初始化
enum class EnumColor(color:Int)
{
    RED(0xFFFFFF),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
//匿名类
enum class EnumClass
{
    SHOW{
        fun function1()=HIDE
    },
    HIDE
    {
        fun function2()=SHOW
    }
}
fun main(args:Array<String>)
{
   var info:EnumClass= EnumClass.valueOf("SHOW")
    println(info)
    var e=EnumClass.values();
    e.forEach { println(it) }
}