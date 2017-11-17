package studay7
fun getAge():Int=27 //当函数返回单个表达式时，可以省略花括号，加入 = 代码体
fun getPhoneNumber()="15321810823" //如果返回值类型确定可以省略返显式声明返回类型
fun main(args:Array<String>)
{
    println(getPhoneNumber())
    println(getAge())
}