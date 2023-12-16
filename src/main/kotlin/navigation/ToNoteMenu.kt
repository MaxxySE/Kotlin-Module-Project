package navigation

import addition.Note
import noteMenu

object ToNoteMenu {

    fun show(noteList : ArrayList<Note>){
        Nav.showNotesScreen(noteList)
        noteMenu.selectNoteItem(noteList)
    }

}