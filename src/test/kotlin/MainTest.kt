import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    fun testOrderAndBoundaries() {
        assertEquals(9, findLargest(intArrayOf(9, 8, 7)))
        assertEquals(9, findLargest(intArrayOf(8, 9, 7)))
        assertEquals(9, findLargest(intArrayOf(7, 8, 9)))
    }

    @Test
    fun testDuplicates() {
        assertEquals(9, findLargest(intArrayOf(9, 7, 9, 8)))
    }

    @Test
    fun testForOnlyOneNumber() {
        assertEquals(7, findLargest(intArrayOf(7)))
    }


    @Test
    fun testNegativeNumbers() {
        assertEquals(-7, findLargest(intArrayOf(-7,-8,-9)))
    }
}