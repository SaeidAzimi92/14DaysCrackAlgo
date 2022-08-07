package day1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BinarySearchTest {

    @Test
    fun `index not found binary search`() {
        val inputs = intArrayOf(1, 2, 3, 7, 9, 14, 18, 25, 45, 67, 69)
        val target = 19

        val index = BinarySearch().findIndexByBinarySearch(inputs, target)
        assertEquals(-1, index)
    }

    @Test
    fun `index found in binary search`() {
//        Input: nums = [-1,0,3,5,9,12], target = 9
//        Output: 4
//        Explanation: 9 exists in nums and its index is 4
        val inputs = intArrayOf(1,0,3,5,9,12)
        val target = 9

        val index = BinarySearch().findIndexByBinarySearch(inputs, target)
        assertEquals(4, index)
    }
}