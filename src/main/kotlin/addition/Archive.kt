package addition

data class Archive (
    override val name : String,
    val noteList : ArrayList<Note>) : NameContainer