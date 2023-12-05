package structural_pattern.decoratorv2

class BubbleLihts (tree: IChristmasTree) : TreeDecorator(tree) {
    override fun decorate(): String {
        return super.decorate() + decorateWithBubbleLights()
    }
    private fun decorateWithBubbleLights(): String {
        return "with Bubble lights"
    }
}