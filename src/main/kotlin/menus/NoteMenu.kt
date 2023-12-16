package menus

import addition.CheckInput
import addition.Note
import archiveList
import navigation.ToArchiveMenu
import navigation.ToNoteMenu
import noteList

class NoteMenu {

    private val checkInput : CheckInput = CheckInput()
    var listOfNotes = noteList

    fun selectNoteItem(noteList : ArrayList<Note>){
        listOfNotes = noteList
        when(val input = checkInput.itemInput(noteList)){
            0 -> { createNote(noteList) }
            noteList.size + 1 -> {
                ToArchiveMenu.show(archiveList)
            }
            else -> {
                readNote(noteList[input - 1])
            }
        }
    }

    private fun createNote(noteList : ArrayList<Note>){
        val note = Note(checkInput.nameInput(noteList), checkInput.textInput())
        noteList.add(note)

        ToNoteMenu.show(noteList)
    }

    private fun readNote(note : Note){
        println("Текст заметки: ")
        println(note.text + "\n")

        ToNoteMenu.show(listOfNotes)
    }

}