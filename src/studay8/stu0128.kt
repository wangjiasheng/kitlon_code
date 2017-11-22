package studay8

fun main(args: Array<String>) {
    var info: IntProgression = IntProgression.fromClosedRange(0, 20, 1)
    var rev = info.reversed().step(5);
    for (x in rev) {
        println(x)
    }
}