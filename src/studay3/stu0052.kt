package studay3
fun forecho()
{
    var list= listOf<Int>(1,3,5,7,9)
    list.forEach {
        print(it)
        println()
        list.forEach eh@{
            print(it)
            if(it==5) {
                print("\r\nreturn")
                return@eh;
            }
        }
        println()
    }
}
fun main(args:Array<String>)
{
    forecho()
}