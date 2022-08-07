package day1

class BinarySearch {
//     Given an array of integers nums which is sorted in ascending order,
//     and an integer target, write a function to search target in nums.
//     If target exists, then return its index. Otherwise, return -1.
//     You must write an algorithm with O(log n) runtime complexity.

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