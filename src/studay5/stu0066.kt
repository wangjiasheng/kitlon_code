package studay5

interface Studlib1
{
    var age:Int;
    val name:String
        get() = "name"
    fun function1()
    fun function2()
    {

    }
    fun println()
    {
        println(name)
    }
}
open class Parent
{
    open fun function1(){}
    open fun function2()
    {

    }
}
class Child:Studlib1,Parent()
{
    override var age: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        set(value) {}
    override fun function1() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun function2() {
        super<Parent>.function2()
    }
}