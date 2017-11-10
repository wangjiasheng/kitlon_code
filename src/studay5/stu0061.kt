package studay5

class User
{
    var username:String="username";
    var password:String="password";
    var age:Int=0;
}
fun main(args:Array<String>)
{
     var user=User();
    println(user.username);
    println(user.password);
}