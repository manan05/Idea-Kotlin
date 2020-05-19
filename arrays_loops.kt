public fun main() {
    errorMyList()
    removeFromMyList()
    useListOf()
}
// This function shows an error that we get while modifying value of a list
public fun errorMyList() {
    val myList = mutableListOf("tuna", "salmon", "shark")
    // there will be an error if we try to change the values of myList
    // error = val cannot be reassigned
    println(myList)
}

// This function removes the elem from the list
public fun removeFromMyList() {
    val myList = mutableListOf("tuna", "salmon", "shark")
    println(myList)
    myList.remove("shark")
    println(myList)
}

// creates a list of elements using the function listOf()
public fun useListOf(){
    val fish = 12
    val plants = 5
    val swarm = listOf(fish,plants)
    println(swarm)
}