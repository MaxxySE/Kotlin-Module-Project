import addition.Archive
import addition.Note
import menus.ArchiveMenu
import menus.NoteMenu
import navigation.ToArchiveMenu

val archiveList : ArrayList<Archive> = arrayListOf()
val archiveMenu : ArchiveMenu = ArchiveMenu()
val noteMenu : NoteMenu = NoteMenu()
val noteList : ArrayList<Note> = arrayListOf()

fun main(args: Array<String>) {
    startScreen()
}

fun startScreen(){
    ToArchiveMenu.show(archiveList)
}