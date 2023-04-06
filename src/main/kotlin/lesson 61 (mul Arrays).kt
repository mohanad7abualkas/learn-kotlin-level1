class `lesson 61 (mul Arrays)` {

    fun mulArray(a: Array<Int>, b: Array<Int>): IntArray {

        var result = IntArray(a.size)
        for (i: Int in a.indices) {

            result[i] = a[i] * b[i]
        }

        return result
    }
}
