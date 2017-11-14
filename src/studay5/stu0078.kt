package studay5

class AnotationSuper<T>(t:T)  //泛型类
fun main(args:Array<String>)
{
    var anotation:AnotationSuper<Int> = AnotationSuper<Int>(2);//泛型实例化
    var box1=AnotationSuper(1);//泛型实例化缩写
    var box2=AnotationSuper("字符串");//泛型实例化缩写
}