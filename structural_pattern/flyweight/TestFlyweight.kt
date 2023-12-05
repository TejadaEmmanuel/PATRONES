package structural_pattern.flyweight

fun main(){
    val playListAbilene = PlayList("musica popular")
    playListAbilene.addPlayItem ("la llorona")
    playListAbilene.addPlayItem ("la martiniana")
    playListAbilene.addPlayItem ("la llorona")
    playListAbilene.printList()
    playListAbilene.addPlayItem ("la sandunga")
    playListAbilene.printList()

    val playListAntonio = PlayList("musica rock")
    playListAntonio.addPlayItem ("la llorona")
    playListAntonio.addPlayItem ("la plaga")
    playListAntonio.addPlayItem ("rock is dead")
    playListAntonio.printList()
    playListAntonio.addPlayItem ("la plaga")
    playListAntonio.printList()

}