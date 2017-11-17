package studay6

import kotlin.reflect.KProperty

//委托属性
class FieldWT
{
    var d:String by Example()
}
class Example
{
    operator fun getValue(fieldWT: Any?, property: KProperty<*>): String
    {
        return  "$fieldWT, thank you for delegating '${property.name}' to me!";
    }
    operator fun setValue(fieldWT: Any?, property: KProperty<*>, s: String) {
        println("$s has been assigned to '${property.name} in $fieldWT.'")
    }
}
fun main(args:Array<String>)
{
    var test=FieldWT();
    println(test.d)
    test.d="333"
    println(test.d)
}
