package studay1

fun descripte(any:Any)
{
    when(any)
    {
        true->println("value is true");
        1->println("value is 1")
        "hello"-> println("value is hello")
    }
}
fun main(args:Array<String>)
{
    descripte(1)
    descripte(true)
    descripte("hello")
}