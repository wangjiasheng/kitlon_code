package studay5

import java.lang.reflect.Executable

class TSUP
{
    private var _table:Map<String,Int>?=null;
    public val  table:Map<String,Int>
        get(){

            if(_table==null)
            {
                _table= hashMapOf("100" to 1)
            }
            return _table?:throw Exception("出错啦，日你妈");
        }
}
fun main(args:Array<String>)
{

    var test=TSUP();
    println(test.table)





}