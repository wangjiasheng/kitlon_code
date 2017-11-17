package studay7
val sum = fun Int.(other: Int): Int = this + other
fun main(args:Array<String>)
{
    var value=1.sum(2)
    println(value)

    var su1:Int.(other:Int)->Int={this+it}
    var su2:Int.(other:Int)->Int={x->this+x}
    println(1.su1(3))
    println(1.su2(3))
}