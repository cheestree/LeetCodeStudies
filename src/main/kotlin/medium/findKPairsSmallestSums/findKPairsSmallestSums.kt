package medium.findKPairsSmallestSums

import java.util.*

fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
    val pairs: MutableList<List<Int>> = mutableListOf()

    if (nums1.isEmpty() || nums2.isEmpty() || k <= 0) {
        return pairs
    }

    val minHeap = PriorityQueue<Pair<Int, List<Int>>>(compareBy { it.first })

    for (i in nums1.indices) {
        for (j in nums2.indices) {
            minHeap.offer(nums1[i] + nums2[j] to listOf(nums1[i], nums2[j]))
        }
    }

    var newK = k
    while (newK > 0 && minHeap.isNotEmpty()) {
        pairs.add(minHeap.poll().second)
        newK--
    }

    return pairs
}