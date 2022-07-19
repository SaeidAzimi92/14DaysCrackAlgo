package day2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SortedSquareTest {
    @Test
    internal fun `test sorted square array`() {
        val inputs = intArrayOf( -4, -1, 0, 3, 10)

        val result = SortedSquare().sortSquareOfArray(inputs)
        println(result.contentToString())
        assertEquals(16, result[result.size -2])

    }
    @Test
    internal fun `test equal items sorted square array`() {
        val inputs = intArrayOf( -7, -3, 0, 3, 10)

        val result = SortedSquare().sortSquareOfArray(inputs)
        println(result.contentToString())
        assertEquals(49, result[result.size -2])

    }
}