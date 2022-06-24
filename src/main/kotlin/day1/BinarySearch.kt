package day1

class BinarySearch {
    fun main(args: Array<String>) {

        val inputs = intArrayOf(1, 2, 3, 7, 9, 14, 18, 25, 45, 67, 69)
        val target = 19

        val index = findIndexByBinarySearch(inputs, target)

        println(index)
    }

     fun findIndexByBinarySearch(inputs: IntArray, target: Int): Int {
        var low = 0
        var high = inputs.size - 1
        var mid: Int

        while (low < high) {

            mid = low + ((high - low) / 2)
            when {
                target > inputs[mid] -> low = mid + 1
                target == inputs[mid] -> return mid
                target < inputs[mid] -> high = mid - 1
            }
        }
        return -1
    }
}