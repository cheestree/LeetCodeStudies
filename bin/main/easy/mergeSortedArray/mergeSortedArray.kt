package easy.mergeSortedArray

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    if(n == 0) return
    if(m == 0) nums1.map { nums2[0] }
    nums2.dropLast(nums2.size-n).forEachIndexed { index, i ->
        nums1
    }
}