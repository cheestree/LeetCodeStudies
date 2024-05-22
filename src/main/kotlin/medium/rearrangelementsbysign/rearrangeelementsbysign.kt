package medium.rearrangelementsbysign

import kotlin.math.sign

fun rearrangeArray(nums: IntArray): IntArray {
    //  Readable
    /*
    val posInts = nums.filter { it > 0 }
    val negInts = nums.filter { it < 0 }
    val list = mutableListOf<Int>()
    for(i in posInts.indices){
        list.add(posInts[i])
        list.add(negInts[i])
    }
    return list.toIntArray()
    */
    val n = nums.size
    for (i in nums.indices) {
        for (j in 0 until n - 1 - i) {
            
        }
    }

    return nums
}

fun swap(array: IntArray, j: Int){
    val temp = array[j]
    array[j] = array[j + 1]
    array[j + 1] = temp
}