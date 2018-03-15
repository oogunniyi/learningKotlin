// This is main, the entry point of a Java/Kotlin Application
fun main(args: Array<String>) {
    val firstNumber: Int = 123
    var secondNumber: Int = 0
    var sum = firstNumber + secondNumber
    println("Sum of $firstNumber and $secondNumber = $sum")

    // Change the numbers again:
    secondNumber = 8
    sum = firstNumber + secondNumber
    println("Next Sum of $firstNumber and $secondNumber = $sum")
}