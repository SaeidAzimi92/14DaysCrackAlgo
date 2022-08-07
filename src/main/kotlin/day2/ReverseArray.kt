package day2


class ReverseArray {
//    Problem: Given an array, rotate the array to the right by k steps, where k is non-negative.

    fun rotate(inputs: IntArray, k: Int): IntArray {
        val rotateIndex = k % inputs.size
        val len = inputs.size - 1

        reverseArray(inputs, 0, len)

        reverseArray(inputs, 0, rotateIndex - 1)
        reverseArray(inputs, rotateIndex, len)
        return inputs
    }

    private fun reverseArray(inputs: IntArray, _start: Int, _end: Int) {
        var start = _start
        var end = _end
        while (start < end) {
            val temp: Int = inputs[start]
            inputs[start] = inputs[end]
            inputs[end] = temp
            start++
            end--
        }
    }


}