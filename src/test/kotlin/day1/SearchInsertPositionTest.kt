package day1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SearchInsertPositionTest {

    @Test
    fun findPosition() {
//  Input: nums = [1,3,5,6], target = 5
//  Output: 2
        val inputs = intArrayOf(1,3,5,6)
        val position = SearchInsertPosition().findPosition(inputs, 5)
        assertEquals(2, position)
    }
    @Test
    fun `findPosition for absent target`() {
//  Input: nums = [1,3,5,6], target = 4
//  Output: 1
        val inputs = intArrayOf(1,3,5,6)
        val position = SearchInsertPosition().findPosition(inputs, 4)
        assertEquals(2, position)
    }
}