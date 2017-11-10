package studay2

import java.io.File
//如果为null打印null否则打印empty
fun main(args:Array<String>)
{
    var files=File("e:\\ProgramData\\Intel\\DAL\\Applets").listFiles();
    println(files?.size);//如果为空则打印空否则打印size
    println(files?.size?:"empty");//如果为空则打印empty否则打印size
    println(null?:"empty")
}