package medium.threeSum

//  Two-pointer algorithm:
//  Using a sorted list, check the sum per i and left right pointers.
//  If the sum is less, move left pointer up
//  If the sum is more, move right pointer down
//  If the sum is 0 (in this case), add triplet and move both pointers
fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    nums.sort()

    for (i in 0 until nums.size - 2) {
        if (i == 0 || (nums[i] != nums[i - 1])) {
            var left = i + 1
            var right = nums.size - 1
            val target = -nums[i]

            while (left < right) {
                val sum = nums[left] + nums[right]

                when {
                    sum == target -> {
                        result.add(listOf(nums[i], nums[left], nums[right]))
                        while (left < right && nums[left] == nums[left + 1]) left++
                        while (left < right && nums[right] == nums[right - 1]) right--
                        left++
                        right--
                    }
                    sum < target -> left++
                    else -> right--
                }
            }
        }
    }

    return result
}