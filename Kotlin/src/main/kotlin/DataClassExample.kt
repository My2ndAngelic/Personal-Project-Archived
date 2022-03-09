class DataClassExample {
    var name: String

    constructor() {
        name = ""
    }

    constructor(name: String) {
        this.name = name
    }

    override fun toString(): String {
        return "Hello $name. Welcome to Kotlin."
    }
}

fun main(args: Array<String>) {
    val dce = DataClassExample("John")
    println(dce.toString());

    dce.name = "Cena";
    println(dce.toString())
}