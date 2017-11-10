package studay1

fun main(args:Array<String>)
{
    var list= listOf<Any>("1",true,3)
    when
    {
        "1" in  list->{print("1");}
        true in list->{print("true");}
        3 in list->{print(3);}
    }
}