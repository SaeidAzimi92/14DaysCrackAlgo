package day3

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TwoSumTest {

    @Test
    fun `find indexes for positive numbers`() {
//        Input: numbers = [2,7,11,15], target = 9
//        Output: [1,2]
//        Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
        val input = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expected = intArrayOf(1, 2)
        val twoSumIndex = TwoSum().calculateTwoSum(input, target)
        assertEquals(expected.contentToString(), twoSumIndex.contentToString())
    }
    @Test
    fun `find indexes for negative numbers`() {
//        Input: numbers = [-1,0, 2, 5], target = -1
//        Output: [1,2]
//        Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
        val input = intArrayOf(-1,0, 2, 5)
        val target = -1
        val expected = intArrayOf(1, 2)
        val twoSumIndex = TwoSum().calculateTwoSum(input, target)
        assertEquals(expected.contentToString(), twoSumIndex.contentToString())
    }

}