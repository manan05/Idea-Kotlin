import java.util.*

fun main() {

    hello()
    addString()
    accessNumString()
    addNumString()
    normalCompare()
    ifElse()
    inInsideIf()
    whenSwitch()
}

//Normal printing String and defining it
public fun hello(){
    val hello = "Hello Fish"
    println(hello)
}

public fun addString() {
    val hello = "Hello"
    val fish = "fish"
    println(hello + fish)
}

public fun accessNumString() {
    val noOfFish = 5
    val noOfPlant = 12
    //Dollar symbol is used to access the value of the variable
    println("I have $noOfFish fishes and $noOfPlant plants.")
}

public fun addNumString() {
    val noOfFish = 5
    val noOfPlant = 12
    //First the bracket will be solved and then it will be printed
    println("I have ${noOfFish + noOfPlant} fishes and plants.")
}

//normally compares the strings
public fun normalCompare(){
    val fish = "fish"
    val plant  = "plant"
    println(fish == plant)
    println(fish == fish)
    println(fish != plant)
}
//Normal IfElse conditions
public fun ifElse(){
    val noOfFish = 50
    val noOfPlants = 23
    if(noOfFish < noOfPlants){
        println("Unhealthy Ratio")
    }
    else{
        println("Healthy Ratio")
    }
}

//(in) operator used with (if)
//used to specify the range
public fun inInsideIf(){
    val fish = 50
    if(fish in 1..100){ //means from 1 to 100
        println(fish)
    }
}

//When - Switch case of kotlin

public fun whenSwitch(){
    val fish= 50
    when(fish){
        0 -> println("Empty Tank")
        50 -> println("Full Tank")
        else -> println("Perfect")
    }
}