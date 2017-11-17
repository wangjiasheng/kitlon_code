package studay7

class HTML
{
    fun body() {
    }
}
fun html(init:HTML.()->Unit):HTML
{
    var hl=HTML();
    hl.init()
    return hl;
}
fun main(args:Array<String>)
{
    html {
        println("init")
    }
}