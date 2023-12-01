package easy.searchInsertPosition

fun searchInsert(nums: IntArray, target: Int): Int {
    val index = binarySearch(nums, target)
    return if(index != null){
        index
    }else{
        val newIdx = nums.indexOfFirst { it > target }
        if (newIdx == -1){
            nums.size
        }else{
            newIdx
        }
    }
}

fun binarySearch(nums: IntArray, target: Int): Int?{
    var left = 0
    var right = nums.size-1
    while(left<=right){
        val middle = left+(right-left)/2
        if(nums[middle]==target) {
            return middle
        }
        if(nums[middle]<target){
            left = middle+1
        }else{
            right = middle-1
        }
    }
    return null
}