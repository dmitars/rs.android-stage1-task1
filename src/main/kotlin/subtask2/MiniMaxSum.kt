package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        input.sort()
        var numbers: IntArray = intArrayOf(0,0)
        for(i in 0..(input.size-2))
            numbers[0]+=input[i]
        for(i in 1..input.size-1)
            numbers[1]+=input[i]
        return numbers
    }
}
