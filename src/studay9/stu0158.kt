package studay9

import importjava.AnnArrayValue
import importjava.AnnWithValue

@AnnWithValue("d")
class DESCA
fun getValue(args: AnnWithValue)
{
    println(args.value)
}
fun main(args:Array<String>)
{
    var d=DESCA();
    println(d)
}