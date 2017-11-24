package studay10

fun<A,B,C> compose(f:(B)->C,g:(A)->B) : (A)->C
{
    return {x->f(g(x))}
}
fun getLength(s:String)=s.length
fun isOdd(s: Int) = s>1
fun main(args:Array<String>)
{
    var str= arrayListOf<String>("a","b","abc")
    var st=compose<String,Int,Boolean>(::isOdd, ::getLength)
    println(st)
    println(str.filter(st));
}