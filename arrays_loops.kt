public fun main() {
    errorMyList()
//    removeFromMyList()
}

public fun errorMyList() {
    val myList = mutableListOf("tuna", "salmon", "shark")
    // there will be an error if we try to change the values of myList
    // error = val cannot be reassigned
    println(myList)
}

public fun removeFromMyList() {
    val myList = mutableListOf("tuna", "salmon", "shark")
    println(myList)
    myList.remove("shark")
    println(myList)
}