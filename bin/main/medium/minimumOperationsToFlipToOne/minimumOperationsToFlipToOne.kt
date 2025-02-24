package medium.minimumOperationsToFlipToOne

fun minOperations(nums: IntArray): Int {
    var operations = 0
    var idx = 0
    while (idx + 2 < nums.size) {
        if (nums[idx] == 0) {
            nums[idx] = nums[idx] xor 1
            nums[idx + 1] = nums[idx + 1] xor 1
            nums[idx + 2] = nums[idx + 2] xor 1
            operations++
        }
        idx++
    }
    return if (nums.all { it == 1 }) {
        operations
    } else {
        -1
    }
}