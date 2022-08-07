package day3

class MoveZero {
//    Given an integer array nums, move all 0's to the end of it
//    while maintaining the relative order of the non-zero elements.
//    Note that you must do this in-place without making a copy of the array.

    fun moveZeroToEndOfArray(input: IntArray): IntArray {
        var left = 0
        var right = 0

        while (right < input.size) {
            if (input[right] != 0) {
                val temp = input[left]
                input[left] = input[right]
                input[right] = temp
                left++
            }
            right++
        }
        return input
    }

}