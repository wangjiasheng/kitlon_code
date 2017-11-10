package studay2

import java.io.File

fun main(args:Array<String>)
{
    var files= File("c://").listFiles();
    println(files?.size);
}