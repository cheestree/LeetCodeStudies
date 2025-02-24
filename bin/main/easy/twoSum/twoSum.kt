package easy.twoSum
//  https://leetcode.com/problems/two-sum/

fun twoSum(nums: IntArray, target: Int): IntArray {
    nums.forEachIndexed { idx1, i ->
        if(idx1 == nums.size-1) return intArrayOf(0, 0)
        for(idx2 in (idx1+1)..<nums.size){
            if(i + nums[idx2] == target) {
                return intArrayOf(idx1, idx2)
            }
        }
    }
    return intArrayOf(0, 0)
}
