package studay3

fun main(args:Array<String>)
{
    if(true)
    {
        val a: Int = 10000
        print(a === a) // Prints 'true'
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        print(boxedA == anotherBoxedA) // !!!Prints 'true'!!!
        print(boxedA === anotherBoxedA) // !!!Prints 'false'!!!
        print(boxedA == anotherBoxedA) // !!!Prints 'true'!!!
        println();
    }
    var a:Int=100;
    print(a===a)
    var boxedA:Int?=a;
    var anotherBoxedA:Int?=a;
    print(boxedA===anotherBoxedA);
}