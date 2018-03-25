package homework

/**
Programming exercises:
 * Write a function to print “Hello $name” where name is a function argument
 * Write a function to print a list of even numbers between a certain range:
 * printEvenNumbers(start, finish)
 * Write a function to print a fib sequence up to specified number position
    * printFib(number)
 * Create a class called “Dog” with properties / methods:
     * val name
     * val breed
     * val color
     * val barkSound: String
     * var isHungry : Boolean - false
     * def bark() -> Prints barkSound
     * def run() -> prints dog is running, make isHungry to true
     * def eat() -> if Hungry, print Dog eats, if not hungry, print Dog refuses to eat.
 */

/**
 * Prints the fibonacci sequence up to the nth position
 *
 * @param nThPosition 0 based positioning of the Fib Sequence
 */
fun printFibSequence(nThPosition: Int) {
    // The first
    val fibSequence = mutableListOf(0)
    if (nThPosition == 0) {
        println(fibSequence)
        return
    }

    // The sequence now contains 0, 1
    fibSequence.add(1)
    // We store our iterated value in n, and will go up to the nth position
    var n = 1
    while (n < nThPosition) {
        // The last Fib Number is the previous element in the list
        val lastFibNumber = fibSequence.get(n-1)
        // The Current Fib number is the current element in the list
        val currentFibNumber = fibSequence.get(n)
        // Add the Previous number and the current number, then append it to the list
        fibSequence.add(lastFibNumber + currentFibNumber)

        // Increment n for the next position
        n++
    }

    println(fibSequence)
}