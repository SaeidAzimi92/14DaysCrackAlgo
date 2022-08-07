package day4

class ReverseWords {

    fun reverseWords(input: String): String {
        val reversedString = StringBuilder()
        input.split(" ").forEach {
            reversedString.append(reverse(it)).append(" ")
        }
        return reversedString.toString().trim()
    }

    private fun reverse(word: String): String {
        var start = 0
        var end = word.length - 1
        val reversedWord = word.toCharArray()
        while (start < end) {
            val temp = reversedWord[start]
            reversedWord[start] = reversedWord[end]
            reversedWord[end] = temp
            start++
            end--
        }
        return reversedWord.concatToString()
    }

}