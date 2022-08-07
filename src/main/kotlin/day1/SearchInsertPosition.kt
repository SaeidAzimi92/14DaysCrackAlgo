package day1

class SearchInsertPosition {
//    Given a sorted array of distinct integers and a target value,
//    return the index if the target is found.
//    If not, return the index where it would be if it were inserted in order.
//    You must write an algorithm with O(log n) runtime complexity.

    fun findPosition(inputs: IntArray, target: Int): Int {
        var start = 0
        var end = inputs.size

        while (start <= end) {
            val mid = start + ((end - start) / 2)

            if (inputs[mid] == target) return mid

            if (inputs[mid] > target) {
                if (inputs[mid - 1] < target) return mid
                end = mid - 1
            }
            if (inputs[mid] < target) {
                if (inputs[mid + 1] > target) return mid
                start = mid + 1
            }
        }
        return 1
    }
}