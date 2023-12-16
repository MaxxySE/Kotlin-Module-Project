package addition

class CheckInput {

    fun <T> itemInput(array: ArrayList<T>) : Int {

        var item : Int?

        do {
            item = readln().toIntOrNull()
            if (item == null) {
                println("Введено не число, повторите ввод")
            } else if (item > array.size + 1){
                println("Введено некорректное число, повторите ввод")
                item = null
            }
        } while (item == null)

        return item
    }

    fun <T : NameContainer> nameInput(array: ArrayList<T>) : String{

        var name = ""

        println("Введите название: ")

        do {
            name = readln()
            if (name.trim() == "") {
                println("Введено пустое значение. Повторите ввод.")
                name = ""
            } else {
                for (i in 0 until array.size){
                    if (array[i].name == name){
                        println("Данное имя уже существует. Повторите ввод.")
                        name = ""
                    }
                }
            }
        } while (name == "")

        return name
    }

    fun textInput() : String{

        var text = ""

        println("Введите текст: ")

        do {
            text = readln()
            if (text.trim() == ""){
                println("Введено пустое значение. Повторите ввод.")
                text = ""
            }
        } while (text == "")

        return text
    }
}