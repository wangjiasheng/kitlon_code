package studay7
//lambda表达式
fun main(args:Array<String>)
{
    val sum1={x:Int,y:Int->x>y}//简写
    var sum2:(Int,Int)->Boolean={x,y->x<y}//完整写法
    println(sum1(10,0))
    println(sum2(10,40))


    var list= listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    println(list.filter { it>5 })
    println(list.filter { x:Int->x<0})

}