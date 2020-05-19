import java.util.*

public fun main() {
    errorMyList()
    removeFromMyList()
    useListOf()
    makeMixStrings()
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

//
public fun makeMixStrings(){
    // make strings of only integers
    val numbers = intArrayOf(10,20,30,40)
    println(Arrays.toString(numbers))


//    val thisArray = Arrays.toString(intArrayOf(2,"foo")) // this line gives type mismatch error
//    println(thisArray)

    // a mix array containing strings, int, double, char
    val mix = arrayOf("fish" , 2 , 3.15 , 'a')
    println(Arrays.toString(mix))
}