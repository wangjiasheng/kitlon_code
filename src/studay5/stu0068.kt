package studay5
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main(args:Array<String>)
{
    val l = mutableListOf(1, 2, 3,4,5,6)
    l.swap(0, 2) // 'this' inside 'swap()' will hold the value of 'l'
    l.forEach(){println(it)}
}