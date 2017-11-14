package studay5


fun <T:Comparable<T>> sort(list:List<T>)//相当于  <? extends Super> T必须是T的子类并且不包括T
{

}
fun main(args:Array<String>)
{
    sort(listOf(1,2,3,4))
}