package studay5
class KZFX<T>
{
    fun<H> singleList(item:H):ArrayList<H>
    {
        var dd=ArrayList<H>();
        return dd;
    }
    fun<H> H.singleTest():String{
        return "1";
    }
    fun test():String
    {
        return "".singleTest();
    }
}
fun main(args:Array<String>)
{
     var test=KZFX<String>();
     var s:ArrayList<String> = test.singleList<String>("3")
     println(s)
     println(test.test())
}