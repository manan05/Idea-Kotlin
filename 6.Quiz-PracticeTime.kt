public fun main(){
//    basicOps()
//    vars()
    nullList()
}

//Practice Time: Basic Operations
//Solve the following using the operator methods in one line of code.
//
//If you start with 2 fish, and they breed twice, producing 71 offspring
//the first time, and 233 offspring the second time, and then 13 fish are
//swallowed by a hungry moray eel, how many fish do you have left? How many
//aquariums do you need if you can put 30 fish per aquarium?

public fun basicOps(){
    var fish = 2
    var fishLeft = fish.plus(71).plus(233).minus(13).div(30).plus(1)
    println(fishLeft)
}

//Practice Time: Variables
//Create a String variable rainbowColor, set its color value, then change it.
//Create a variable blackColor whose value cannot be changed once assigned. Try changing it anyway.

public fun vars(){
    var rainbowColor = "blue"
    println(rainbowColor)
    rainbowColor = "red"
    println(rainbowColor)

    val blackColor = "black"
//    blackColor = "white" //because val cannot be changed
    println(blackColor)

}

//Practice Time: Nullability
//Try to set rainbowColor to null.
//Declare two variables, greenColor and
//blueColor. Use two different ways of setting them to null.

public fun nullElem() {
    var greenColor = null
    var blueColor : Int? = null
    blueColor = 20
}

//Practice Time: Nullability/Lists
//Create a list with two elements that are null; do it in two different ways.
//Next, create a list where the list is null.

public fun nullList(){
    var z = listOf(null,null)
    print(z)

    var list:List<Int?> = listOf(null,null)
    var list2:List<Int>? = null // using elvis operator to state that this var can be null too


}