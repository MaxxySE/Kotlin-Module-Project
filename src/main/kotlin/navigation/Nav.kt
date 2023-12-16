package navigation

import addition.Archive
import addition.Note

object Nav {

    fun showStartScreen(archiveList : ArrayList<Archive>){
        println("Список архивов: ")
        println("0. Создать архив")
        for(i in 0 until archiveList.size){
            println("${i + 1}. ${archiveList[i].name}")
        }
        println("${archiveList.size + 1}. Выход")
    }

    fun showNotesScreen(noteList : ArrayList<Note>){
        println("Список заметок: ")
        println("0. Создать заметку")
        for(i in 0 until noteList.size){
            println("${i + 1}. ${noteList[i].name}")
        }
        println("${noteList.size + 1}. Назад")
    }

}