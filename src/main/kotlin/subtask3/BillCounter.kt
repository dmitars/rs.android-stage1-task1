package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = Arrays.sum(bill)
        sum = sum - bill[k]
        sum/=2
        if(sum!=b)
            return toString(b-sum)
        else
            return "Bon Appetit"
    }
}
