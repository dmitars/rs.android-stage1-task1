package subtask4

import java.util.*

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
       var squareBrackets = Stack<Int>()
       var roundBrackets = Stack<Int>()
        var triangleBrackets = Stack<Int>()
        var tempStack = Stack<Int>()
        var answer:MutableList<String> = mutableListOf()
        var tempList:MutableList<String> = mutableListOf()
        var isBracket = false
        for(i in 0..inputString.length-1) {
            if (inputString[i] == '(')
                roundBrackets.push(i)
            if (inputString[i] == '[')
                squareBrackets.push(i)
            if (inputString[i] == '<')
                triangleBrackets.push(i)
            if (inputString[i] == ')') {
                tempStack = roundBrackets
                isBracket = true
            }
            if (inputString[i] == ']') {
                tempStack = squareBrackets
                isBracket = true
            }
            if (inputString[i] == '>') {
                tempStack = triangleBrackets
                isBracket = true
            }
            if(isBracket) {
                if (squareBrackets.size + triangleBrackets.size + roundBrackets.size == 1) {
                    addString(inputString, i, tempStack, answer)

                    if (tempList.size != 0) {
                        tempList.reverse()
                        for (item in tempList)
                            answer.add(item)
                        tempList.clear()
                    }
                } else
                    addString(inputString, i, tempStack, tempList)
                isBracket = false
            }

        }
        return Array(answer.size){i->answer[i]}
    }

    fun addString(inputString: String,i:Int,tempStack: Stack<Int>,list:MutableList<String>){
       list.add(inputString.subSequence(tempStack.pop() + 1, i).toString())
    }
}
