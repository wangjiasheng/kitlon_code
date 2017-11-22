package studay9
@Target(AnnotationTarget.CLASS)
annotation class Special(val why: String)

@Special("example") class Foo {}