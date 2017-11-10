package studay1

fun main(args:Array<String>)
{
    listOf<String>("hello","word","hellen","huoqian")
    .filter { it.startsWith("h") }//过滤
    .sortedBy { it } //排序
    .map{it.toUpperCase()}//
    .forEach { println(it)}//循环
}