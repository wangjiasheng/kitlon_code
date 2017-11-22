package studay9
@Target(AnnotationTarget.FIELD,AnnotationTarget.PROPERTY_GETTER,AnnotationTarget.VALUE_PARAMETER)
annotation class Test
class Example(@field:Test val foo:String,//标注java字段
              @get:Test val bar:String,//标注java getter
              @param:Test valquux:String)//标注java构造函数参数

