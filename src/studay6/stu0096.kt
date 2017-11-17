package studay6

interface FXSINGLE<T>
{
    fun create():T
}
class Test
{

}
class SINGLEFX
{
    companion object :FXSINGLE<Test>{
        override fun create(): Test = Test();
    }
}
fun main(args:Array<String>)
{
    var test=SINGLEFX.create();
}