package day1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FirstBadVersionTest {

    @Test
    fun findBadVersion() {
        val firstBadVersion = FirstBadVersion(4)
        val badVersion = firstBadVersion.findBadVersion(5)
        assertEquals(4, badVersion)
    }
}