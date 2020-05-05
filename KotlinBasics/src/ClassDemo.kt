class Vehicle {
    var wheels = 2
    constructor(wheels: Int){
        this.wheels = wheels
    }
    fun getAxles():Int{
        return wheels/2
    }
}

fun main(args: Array<String>) {
    val v = Vehicle(4)
    println(v.wheels)
    println(v.getAxles())
}