package day1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BinarySearchTest {
    private var inputs = intArrayOf(1, 2, 3, 7, 9, 14, 18, 25, 45, 67, 69)

    @Test
    fun `index not found binary search`() {
        val target = 19

        val index = BinarySearch().findIndexByBinarySearch(inputs, target)
        assertEquals(-1, index)
    }

    @Test
    fun `index found in binary search`() {
        val target = 18

        val index = BinarySearch().findIndexByBinarySearch(inputs, target)
        assertEquals(6, index)
    }
}