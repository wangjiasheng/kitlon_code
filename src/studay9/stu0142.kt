package studay9

data class User(var username:String?,var passsword:String?)
{

}
fun faile(message:String):Nothing
{
    throw IllegalArgumentException(message)
}
fun main(args:Array<String>)
{
    var user= User("314232332",null);
    println(user.username?:throw faile("卧槽"))
    println(user.passsword?:throw faile("卧槽"))
}