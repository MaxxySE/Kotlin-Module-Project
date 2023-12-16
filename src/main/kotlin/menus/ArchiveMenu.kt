package menus

import addition.Archive
import addition.CheckInput
import addition.NameContainer
import navigation.ToArchiveMenu
import navigation.ToNoteMenu


class ArchiveMenu {

    private val checkInput : CheckInput = CheckInput()

    fun selectArchiveItem(archiveList : ArrayList<Archive>){
        when(val input = checkInput.itemInput(archiveList)){
            0 -> { createArchive(archiveList) }
            archiveList.size + 1 -> {
                println("Выходим")
                return
            }
            else -> readArchive(archiveList[input - 1])
        }
    }

    private fun createArchive(archiveList : ArrayList<Archive>){
        val archive = Archive(checkInput.nameInput(archiveList), arrayListOf() )
        archiveList.add(archive)

        ToArchiveMenu.show(archiveList)
    }

    private fun readArchive(archive : Archive){
        ToNoteMenu.show(archive.noteList)
    }

}