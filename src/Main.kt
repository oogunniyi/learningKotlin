import homework.Dog
import homework.DogExpanded

// This is main, the entry point of a Java/Kotlin Application
fun main(args: Array<String>) {
    // See how both Dog classes are Constructed the same way:
    val expandedDog = DogExpanded(
            name = "Maya",
            breed = "Bull Terrior",
            color = "Blue",
            barkSound = "Woof")

    val myDogMaya = Dog(
            name = "Maya",
            breed = "Bull Terrior",
            color = "Blue",
            barkSound = "Woof")

    println("${myDogMaya.name}, a ${myDogMaya.breed} was born, with a ${myDogMaya.color} coat")

    myDogMaya.eat() // Should print not hungry
    myDogMaya.bark()
    myDogMaya.run()
    myDogMaya.eat() // Should eat just fine
}
