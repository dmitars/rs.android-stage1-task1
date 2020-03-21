package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
       input.sort()
        var numbers: IntArray = arrayOf(0,0);
        for(i in 0..3)
            numbers+=input[i]
        for(i int 1..4)
            numbers+=input[i]
        return numbers
    }
}
