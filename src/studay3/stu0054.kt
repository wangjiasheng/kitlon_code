package studay3

fun forecho2()
{
    var list= listOf<Int>(1,3,5,7,9)
    list.forEach {
        print(it)
        println()
        list.forEach(fun(value:Int){
            print(value)
            if(value==5) {
                print("\r\nreturn")
                return;
            }
        })
        println()
    }
}
fun main(args:Array<String>)
{
    forecho2()
}