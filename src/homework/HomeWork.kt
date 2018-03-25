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


fun printEvenNumbers(from: Int, to: Int) {
    // Let's store our Even numbers in a List, so we can customize how we want to print it later:
    val evenNumbers = arrayListOf<Int>()

    // Loop through from -> to
    for (i in from..to) {
        // Check if i is even by doing i modulo 2 and verify that it's result is 0
        // modulo => Represented by %, is the remainder when dividing 2 numbers.
        // ex: 3/2 = 1 with remainder of 1 , ex: 6/2 = 3 with remainder of 0
        if (i % 2 == 0) {
            // Add(append) the even number to the list:
            evenNumbers.add(i)
        }
    }

    // Print the list via using joinToString()
    println(evenNumbers.joinToString())
}
