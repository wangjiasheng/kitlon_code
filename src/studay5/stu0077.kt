package studay5

sealed class EnumSuper  //sealed 未知的，密封的  相当于枚举
data class EnumChild1(var num:Double):EnumSuper()
data class EnumChild2(var sup1:EnumSuper,var sup2:EnumSuper):EnumSuper()
/**
 * @link studay2.stu0021Kt.single
 */
object NullNumber:EnumSuper()//单例对象详见

fun eval(expr:EnumSuper):Double=when(expr)
{
    is EnumChild1->expr.num
    is EnumChild2-> eval(expr.sup1)+eval(expr.sup2)
    NullNumber->Double.NaN
}
fun main(args:Array<String>)
{
    var st=EnumChild1(1.2);
    println(eval(st))
    var st2=EnumChild2(st,st);
    println(eval(st2))
}