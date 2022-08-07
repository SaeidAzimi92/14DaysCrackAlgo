package day3

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MoveZeroTest {

    @Test
    fun moveZeroToEndOfArray() {
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
        val arr = MoveZero().moveZeroToEndOfArray(intArrayOf(0, 1, 0, 3, 12))
        val expectedArray = intArrayOf(1, 3, 12, 0, 0)
        println(arr.contentToString())
        assertEquals(expectedArray.contentToString(), arr.contentToString())
        assertEquals(0, arr[arr.size - 1])
    }
}