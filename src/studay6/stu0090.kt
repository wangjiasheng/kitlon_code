package studay6

//看不懂
enum class Color
{
    RED,BLUE,GREEN
}
inline fun <reified T:Enum<T>> printAllValues()
{
    println(enumValues<T>().joinToString { it.name })
}
fun main(args:Array<String>)
{
    printAllValues<EnumItem>()
    printAllValues<Color>()
}