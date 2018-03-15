import org.junit.Assert.assertEquals
import org.junit.Test

class HelloWorldTest {

    // Write a test to call the "Hello World" function and verify that it returns "Hello World"
    @Test
    fun testShowHelloWorld() {
        val helloWorldObject = HelloWorld()

        assertEquals("Hello World!", helloWorldObject.showHelloWorld())
    }

    @Test
    fun testShowHelloPerson() {
        val helloWorldObject = HelloWorld()
        val expectedPersonsName = "Adam"
        // String interpolation
        assertEquals("Hello $expectedPersonsName!",
                helloWorldObject.showHelloPerson(name = expectedPersonsName))
    }
}