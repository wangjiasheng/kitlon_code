package studay6
//委托
interface Println
{
    fun println()
}
class PrintLnImp(val x:Int):Println {
    override fun println(){println(x)}
}
class Chmod(args:Println):Println by args


fun main(args: Array<String>) {
    val b = PrintLnImp(10)
    Chmod(b).println() // 输出 10
}