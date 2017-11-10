package studay2

import com.google.gson.Gson
//不懂
class GsonTest
{
    inline fun <reified T: Any> Gson.fromJson(json:String): T = this.fromJson(json, T::class.java)
}
fun main(args:Array<String>)
{

}
