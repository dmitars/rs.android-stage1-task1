package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        if(sadArray.size == 0)
            return  sadArray
        var secondList: MutableList<Int> = mutableListOf()
        secondList.add(sadArray[0])
        var size = sadArray.size
        var lastPrevValue = sadArray[0]
        for (i in 1..size-2){

           if(secondList.size>1)
           {
               if(lastPrevValue+sadArray[i+1]>sadArray[i])
               {
                   while(secondList[secondList.size-2]+sadArray[i]<lastPrevValue)
                   {
                       lastPrevValue = secondList[secondList.size-2]
                       secondList.removeAt(secondList.size-1)
                   }
                   lastPrevValue = sadArray[i]
                   secondList.add(sadArray[i])
               }
           }
           else
           {
               if(lastPrevValue+sadArray[i+1]>sadArray[i])
               {
                   lastPrevValue = sadArray[i]
                   secondList.add(sadArray[i])
               }
           }
        }

        while(secondList.size>2 && (secondList[secondList.size-2]+sadArray[size-1])<=secondList[secondList.size-1])
            secondList.removeAt(secondList.size-1)
        secondList.add(sadArray[size-1])
        return secondList.toIntArray()
    }
}
