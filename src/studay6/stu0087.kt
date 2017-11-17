package studay6
//内部类
class SuperInter
{
    inner class InterClazz
    {
        fun println()
        {
            println("卧槽")
        }
    }
}
fun main(args:Array<String>)
{
    SuperInter().InterClazz().println();
}