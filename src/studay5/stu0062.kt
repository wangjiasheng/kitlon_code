package studay5

import wjava.Inject

class GS
{
    var int:Int=3;
    val isEmpty: Boolean  //只读属性
        get() = 1 == 0
    var args:String
       get() = "gethello"
       set(value) {
           println(value)
       }
    val isEmpty2 get() = (1==0)

    var test1:String="abc" //访问修饰符
         private set
    var test2:String="test"
        @Inject set
    var test3:Int=0  //kotlin不能有字段  field后备字段
        get() = field
       set(value) {
            if(value>0)
            {
                field=value;
            }
       }
}
fun main(args:Array<String>)
{
    var asd=GS();

}