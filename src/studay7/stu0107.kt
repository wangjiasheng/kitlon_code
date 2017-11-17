package studay7


inline fun  foo(noinline body:()->Unit)
{
    println("start")
     val f=object :Runnable{
         override fun run()
         {
             body();
         }
     }
    Thread(f).start();
    println("startend")
}
fun main(args:Array<String>)
{
    foo()
    {
        println("hello");
    }
}