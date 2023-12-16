package navigation

import addition.Archive
import archiveMenu

object ToArchiveMenu {

    fun show(archiveList : ArrayList<Archive>){
        Nav.showStartScreen(archiveList)
        archiveMenu.selectArchiveItem(archiveList)
    }

}