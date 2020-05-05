//In this file we will differentiate between var and val in kotlin

public fun main() {

    //VAL
    val n = 2 //defining value of n
    println(n)

//    n = 5
// we cannot do the above written code because it throws an error
// that is "val cannot be reassigned"

    // VAR

    var z = 10 //initially setting z as 10
    println(z)

    z = 20 // changing its value
    println(z)

    z = 'a'.toInt() //can't directly convert it to a char, so using toInt()
    println(z)
}