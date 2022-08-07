package day2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ReverseArrayTest {

    @Test
    fun rotate() {
        //Input: nums = [1,2,3,4,5,6,7], k = 3
        //Output: [5,6,7,1,2,3,4]
        val input = intArrayOf(1,2,3,4,5,6,7)
        val expectedArray = intArrayOf(5,6,7,1,2,3,4)
        val k = 3
        val reverseArray = ReverseArray()

        val rotatedArray = reverseArray.rotate(input, k)
        println(rotatedArray.contentToString())
        assertEquals(expectedArray[1], rotatedArray[1])
    }
}