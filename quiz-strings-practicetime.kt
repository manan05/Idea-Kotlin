public fun main() {
    strings_8()
    trhasn()
    whenfishName()
}


public fun strings_8() {
    var welcome = "Hello and welcome to Kotlin"
    when (welcome.length) {
        0 -> println("Nothing to say?")
        in 1..50 -> println("Perfect!") //we can use (in) with when too.
        else -> println("Too long!") //Else is like default case
    }
}

//Create three String variables for trout, haddock, and snapper.
//Use a String template to print whether you do or don't like to eat these kinds of fish.
public fun trhasn() {
    var trout = "trout"
    var haddock = "haddock"
    var snapper = "snapper"
    println("I like to eat $trout but I don't like $snapper and $haddock.")
}


//when statements in Kotlin are like case or switch statements in other languages.
//
//Create a when statement with three comparisons:
//
//If the length of the fishName is 0, print an error message.
//If the length is in the range of 3...12, print "Good fish name".
//If it's anything else, print "OK fish name".

public fun whenfishName() {
    var fishName = "salmon"
    when (fishName.length) {
        0 -> println("Error")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }
}