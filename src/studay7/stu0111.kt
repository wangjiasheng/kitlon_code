package studay7
//lambda表达式

fun <T> nambda(param1:Collection<T>,param2:(x:T,y:T)->Boolean):T?
{
    var max:T?=null
    for(it in param1)
    {
        if(max==null||param2(max,it))
        {
            max=it
        }
    }
    return max;
}
fun main(args:Array<String>)
{
    var list= listOf<Int>(1,2,3,4,5,3,1)
    var result= nambda(list,{a:Int ,b->a<b})
    println(result)
}