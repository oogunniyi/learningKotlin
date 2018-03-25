package homework

/**
 * This Class DogExpanded is defined with an explicit constructor and properties, there's
 * a cleaner way to do this, as defined in Dog class below.
 */
class DogExpanded {
    // Read only properties within the class, these will be defined via the Constructor
    val name: String
    val breed: String
    val color: String
    val barkSound: String

    // Private property, only accessible within the class
    private var isHungry: Boolean = false

    // Constructor defines how we want to create our class
    constructor(name: String, breed: String, color: String, barkSound: String) {
        this.name = name
        this.breed = breed
        this.color = color
        this.barkSound = barkSound
    }
}

/**
 * This class Dog is the same kind of class as DogExpanded, but with less code.  This is the preferred way.
 *
 */
class Dog(val name: String, val breed: String, val color: String, val barkSound: String) {
    private var isHungry = false
}

