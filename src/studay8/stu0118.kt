package studay8
data class Result(val result: String, val status: String)
fun function():Result
{
    return Result("314232332","812330500")
}
fun main(args:Array<String>)
{
    var(usernameq,passwordq)= function()
    println(usernameq)
    println(passwordq)
}