package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var secondList: MutableList<Int>
        secondList.add(sadArray[0])
        var size = sadArray.size
        var lastPrevValue = sadArray[0]
        for (i in 1..size-2){
            if(lastPrevValue+sadArray[i+1]>=sadArray[i])
            {
                secondList.add(sadArray[i])
                lastPrevValue = sadArray[i]
            }
        }
        while(secondList.size>2 && (secondList[secondList.size-2]+sadArray[size-1])>secondList[secondList.size-1])
            secondList.removeAt(secondList.size-1)
        secondList.add(sadArray[size-1])
        return IntArray(secondList)
    }
}
