package day2

class SortedSquare {

    fun sortSquareOfArray(inputs: IntArray): IntArray {
        val length = inputs.size
        var left = 0
        var right = length - 1
        val result = IntArray(length)
        var resultPointer = length - 1

        while (left <= right) {
            val lsq = inputs[left] * inputs[left]
            val rsq = inputs[right] * inputs[right]

            if (lsq > rsq) {
                result[resultPointer] = lsq
                left++
            } else {
                result[resultPointer] = rsq
                right--
            }
            resultPointer--
        }
        return result
    }
}