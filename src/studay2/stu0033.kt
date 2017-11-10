package studay2

import java.nio.file.Files
import java.nio.file.Paths

fun main(args:Array<String>)
{
    var stream= Files.newInputStream(Paths.get("e://1.html"))
    stream.buffered().reader( Charsets.UTF_8).use { reader-> println(reader.readText()) }
}