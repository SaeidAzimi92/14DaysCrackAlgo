package day1

class FirstBadVersion(private val BAD_VERSION: Int) {
//    Problem: Suppose you have n versions [1, 2, ..., n] and
//    you want to find out the first bad one, which causes all the following ones to be bad.

    fun findBadVersion(n: Int): Int {
        var start = 1
        var end = n

        while (start < end) {
            val mid = start + ((end - start) / 2)
            if (isBAdVersion(mid))
                end = mid - 1
            else
                start = mid + 1
        }
        return start
    }

    private fun isBAdVersion(mid: Int) = BAD_VERSION <= mid
}