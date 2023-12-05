package structural_pattern.decoratorv2

fun main (){
    val pine = PineChristmasTree()
    val christmasTree = BubbleLihts(pine)
    val decoratedChristmasTree = Sphere (christmasTree)

    val decorated = Star (BubbleLihts ( Sphere(PineChristmasTree())))

    println(decoratedChristmasTree.decorate())
    println(decorated.decorate())
}
