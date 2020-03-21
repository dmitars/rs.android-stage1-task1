package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var size = digitString.length/2
        var temp:Char
        var numberOfChanges = k
        var stringBuilder = StringBuilder(digitString)
        var count = 0
        for(i in 0..size-1)
        {
            if(digitString[i]!=digitString[digitString.length-1-i])
                count++
        }
        count = numberOfChanges-count
        if(count<0)
            return "-1"

        for(i in 0..size-1)
        {
            if(digitString[i]!=digitString[digitString.length-1-i]) {
                if (count > 0 && (digitString[i] != '9'
                            && digitString[digitString.length - 1 - i] != '9')) {
                    stringBuilder.setCharAt(i, '9')
                    stringBuilder.setCharAt(digitString.length - i - 1, '9')
                    count--
                    numberOfChanges -= 2
                } else {
                    temp = maxOf(digitString[i], digitString[digitString.length - 1 - i])
                    stringBuilder.setCharAt(i, temp)
                    stringBuilder.setCharAt(digitString.length - 1 - i, temp)
                    numberOfChanges--
                }
            }
        }
        return stringBuilder.toString()
    }
}
