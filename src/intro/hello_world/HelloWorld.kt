class HelloWorld {

    // Create a function that returns "Hello World" String
    fun showHelloWorld(): String {
        return "Hello World!"
    }

    fun showHelloPerson(name: String): String {
        // Create a function that prints AND returns "Hello {name}!" -> name is an parameter
        val message = "Hello $name!"
        println(message)
        return message
    }
}