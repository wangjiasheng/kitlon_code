package studay3

fun forecho1()
{
    var list= listOf<Int>(1,3,5,7,9)
    list.forEach {
        print("x:$it ")
        list.forEach(fun(value:Int){
            print("y:$value ")
           if(value==5) {
                print("z:$value ")
                return@forEach;
            }
        })
        println()
    }
}
fun main(args:Array<String>)
{
    forecho1()
}