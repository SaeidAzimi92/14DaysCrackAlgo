package day4

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ReverseWordsTest {

    @Test
    fun reverseWords() {
        val input = "Let's take LeetCode contest"
        val expected = "s'teL ekat edoCteeL tsetnoc"

        val output = ReverseWords().reverseWords(input)
        assertEquals(expected, output)
    }
}