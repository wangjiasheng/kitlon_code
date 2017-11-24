package studay9

@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.VALUE_PARAMETER)
annotation class Test

class Example(@field:Test val foo: String,//@Test标注java字段           val会生成seter
              @get:Test val bar: String,   //@Test标注java getter        val会生成seter
              @param:Test valquux: String)  //@Test标注java构造函数参数   不会生成seter

fun main(args: Array<String>) {
    println()
}