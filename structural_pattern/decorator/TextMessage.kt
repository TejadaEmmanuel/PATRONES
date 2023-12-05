package structural_pattern.decorator

class TextMessage : IMessage {
    override var content: String =""

    override fun processMessage(): IMessage {
        return this
    }
}