package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
          var sum = 0L
        for(item in bill)
            sum+=item

        sum -= bill[k]
        sum/=2
        return if(sum!=b.toLong())
            (b-sum).toString()
        else
            "Bon Appetit"
    }
}
