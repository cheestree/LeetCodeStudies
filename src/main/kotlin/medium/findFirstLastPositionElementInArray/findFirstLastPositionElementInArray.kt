package medium.findFirstLastPositionElementInArray

fun searchRange(nums: IntArray, target: Int): IntArray {
    if(!nums.contains(target) || nums.isEmpty()) return intArrayOf(-1, -1)
    if(nums.size == 1 && nums[0] == target) return intArrayOf(0, 0)
    /*  Easy to read, bad performance wise
    //  return intArrayOf(nums.indexOfFirst { it == target }, nums.indexOfLast { it == target })
    */
    var left = 0
    var right = nums.size-1
    while(left <= right){
        if(nums[left] < target){
            left++
        }
        if(nums[right] > target){
            right--
        }
        if(nums[right] == target && nums[left] == target){
            break
        }
    }
    return intArrayOf(left, right)
}