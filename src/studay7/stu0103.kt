package studay7

//可变参数

fun function1(username:String,vararg int:Int)
{

}
fun function2(vararg int:Int)
{
    for(x in int)
    {
        println(x)
    }
}
class FX
{
    fun <T> getAge(vararg d:T):List<T>  //可变长参数相当于数组所以可以遍历
    {
        for(x in d)
        {
            println(x)
        }
       return ArrayList()
    }
}
fun main(args:Array<String>)
{
    function1("23",1,1,1);
    var list1= IntArray(4)
    list1.set(0,2)
    list1.set(1,3)
    list1.set(2,4)
    list1.set(3,5)
    function2(*list1);
}