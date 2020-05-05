fun main(args: Array<String>) {
    val x = 10
//    x = "Some String" //type mismatch error
    var y: Float = 20F // Explicitly defined variable // pascal notation
    y = 30F
    var z: Int = y.toInt() //To convert y to integer//bc y was float

    println("Hello World " + x)
    println(y)
    println(z)
}