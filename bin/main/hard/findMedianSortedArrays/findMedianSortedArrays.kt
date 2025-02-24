package hard.findMedianSortedArrays
//  https://leetcode.com/problems/median-of-two-sorted-arrays/

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val totalLength = nums1.size + nums2.size
    val isEven = totalLength % 2 == 0

    var mid = totalLength / 2
    var nums1Iter = 0
    var nums2Iter = 0

    var prev = 0
    var current = 0

    while (nums1Iter + nums2Iter <= mid) {
        prev = current

        val num1 = if (nums1Iter < nums1.size) nums1[nums1Iter] else Int.MAX_VALUE
        val num2 = if (nums2Iter < nums2.size) nums2[nums2Iter] else Int.MAX_VALUE

        if (num1 < num2) {
            current = num1
            nums1Iter++
        } else {
            current = num2
            nums2Iter++
        }
    }

    return if (isEven) {
        (prev + current) / 2.0
    } else {
        current.toDouble()
    }
}