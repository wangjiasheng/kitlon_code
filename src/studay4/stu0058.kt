package studay4

interface Inter
{
    var param:String;
}
class Impl1(override  var param:String):Inter
{

}
class Imp2:Inter
{
    override var param: String=""
}
