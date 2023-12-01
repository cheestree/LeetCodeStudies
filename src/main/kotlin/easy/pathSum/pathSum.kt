package easy.pathSum

fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    if(root==null) return false
    return checkNodeValue(root, 0, targetSum)
}

fun checkNodeValue(node: TreeNode, currentSum: Int, targetSum: Int): Boolean {
    val updatedSum = currentSum + node.`val`

    if (node.left == null && node.right == null) {
        return updatedSum == targetSum
    }

    var leftResult = false
    var rightResult = false

    if (node.left != null) {
        leftResult = checkNodeValue(node.left!!, updatedSum, targetSum)
    }

    if (node.right != null) {
        rightResult = checkNodeValue(node.right!!, updatedSum, targetSum)
    }

    return leftResult || rightResult
}