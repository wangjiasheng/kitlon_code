package studay4

import java.Inject

class Base1
class Base2
{

}
class Base3 constructor(args:String)
class Base4(args:String)
class Base5(args:String)
{
    init {
        println("init")
    }
}
class Base6(str:String)
{
    var params=str.toUpperCase()
}
class Base7(var str:String)
{
  //声明属性并且初始化他们
    fun println()
   {
        println(str);
   }
}
class Base8 public @Inject constructor (str:String)
class Base9
{
    constructor(args:Int) //辅助构造函数
}
class Base10
{
    constructor(args:String)
    {
        println("Base10:1")
    }
    constructor(args:String,age:Int) : this(args)
    {
        println("Base10:2")
    }

}
class Base11 private constructor()
{

}
class Base12(var str:String ="")//构造函数都有默认值,将自动生成无参构造函数
{

}
open class Base13
{
  constructor(args:String)
  {
      println("Base13")
  }
}
class Base14(args:String):Base13(args)
{

}
class Base15 : Base13
{
    constructor(args: String):super(args)
    {
        println("Base15")
    }
}
fun main(args:Array<String>)
{
    var constructor=Base5("Hello");
    var constrctor7=Base7("hello");
    constrctor7.println();
    var constructor10=Base10("hello",2);
    var constructor12=Base12();
    var constructor15=Base15("hello wrod");
}