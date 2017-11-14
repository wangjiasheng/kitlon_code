package studay5
fun copy(from:ArrayList<out Any>,to:ArrayList<Any>)
{
    for(i in from.indices)
    {
        to.add(from[i])
    }
}
fun fill(from:ArrayList<out Number>,to:ArrayList<in Int>)
{
   to.add(1);
}
fun main(args:Array<String>)
{
    var str1= ArrayList<Int>()
    str1.add(1);
    str1.add(2);
    str1.add(3);
    val str2=ArrayList<Any>();
    copy(str1,str2);
    println(str2)

    var str3=ArrayList<Int>();
    str3.add(1);
    str3.add(2);
    str3.add(2);
    var str4=ArrayList<Number>();
    fill(str3,str4);
    println(str4)
}