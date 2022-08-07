package day3

class TwoSum {
    fun calculateTwoSum(input: IntArray, target:Int): IntArray {
        var start = 0
        var end = input.size - 1

        while (start < end) {
            if ((input[start] + input[end]) < target)
                start++
            else if ((input[start] + input[end]) > target)
                end--
            else return intArrayOf(start + 1, end + 1)
        }

        return intArrayOf()
    }
}