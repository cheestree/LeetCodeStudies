package medium.minimumOperationsMedianEqualK

import kotlin.math.abs

/***
 * The problem distorts the concept of median. A median is the middle of the array.
 */

fun minOperationsToMakeMedianK(nums: IntArray, k: Int): Long {
    nums.sort()
    nums.forEach { println(it) }
    println()
    val median = nums[nums.size/2]
    if(median == k) return 0 else return abs(k-median).toLong()
}