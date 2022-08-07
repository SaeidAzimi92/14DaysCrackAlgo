package day4

class ReverseString {
//    Write a function that reverses a string. The input string is given as an array of characters s.
//    You must do this by modifying the input array in-place with O(1) extra memory.


    fun reverse(inputs: CharArray): CharArray {
        var start = 0
        var end = inputs.size - 1
        while (start < end) {
            val temp = inputs[start]
            inputs[start] = inputs[end]
            inputs[end] = temp
            start++
            end--
        }
        return inputs
    }

}

