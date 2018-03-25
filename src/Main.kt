import homework.Dog
import homework.DogExpanded

// This is main, the entry point of a Java/Kotlin Application
fun main(args: Array<String>) {
    // See how both Dog classes are Constructed the same way:
    val expandedDog = DogExpanded(name = "Maya", breed = "Bull Terrior", color = "Blue", barkSound = "Woof")
    
    val myDogMaya = Dog(name = "Maya", breed = "Bull Terrior", color = "Blue", barkSound = "Woof")
}