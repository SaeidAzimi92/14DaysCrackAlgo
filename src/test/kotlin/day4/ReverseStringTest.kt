package day4

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ReverseStringTest {

    @Test
    fun reverse() {
//        Input: s = ['h','e','l','l','o']
//        Output: ['o','l','l','e','h']
        val inputs = charArrayOf('h','e','l','l','o')
        val expected = charArrayOf('o','l','l','e','h')

        val reverse = ReverseString().reverse(inputs)

        assertEquals(expected.concatToString(), reverse.concatToString())
    }
}