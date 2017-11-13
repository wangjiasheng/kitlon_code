package studay5

open class Down1
class Down2 :Down1()
open class Manager1
{
    open fun Down1.foo()
    {
        println("Down1.foo in Manager1")
    }
    open fun Down2.foo()
    {
        println("Down2.foo in Manager1")
    }
    fun call(down : Down1)
    {
        down.foo();
    }
}
class Manager2 : Manager1()
{
    override open fun Down1.foo()
    {
        println("Down1.foo in Manager2")
    }
    override open fun Down2.foo()
    {
        println("Down2.foo in Manager2")
    }
}
fun main(args:Array<String>)
{
    Manager1().call(Down1())   // prints "D.foo in C"
    Manager2().call(Down1())  // prints "D.foo in C1" - dispatch receiver is resolved virtually
    Manager1().call(Down2())  // prints "D.foo in C" - extension receiver is resolved statically
}