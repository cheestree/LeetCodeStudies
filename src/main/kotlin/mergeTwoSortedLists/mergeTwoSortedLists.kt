package mergeTwoSortedLists
//  https://leetcode.com/problems/merge-two-sorted-lists/
//  Not really well explained
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    if(list1 == null && list2 == null) return null
    if(list1 == null) return list2
    if(list2 == null) return list1
    val firstListNode = ListNode(if(list1.value > list2.value) list1.value else list2.value)
    var newL1 : ListNode? = list1
    var newL2 : ListNode? = list2
    while(newL1?.next != null || newL2?.next != null){
        if(newL1?.value!! > newL2?.value!!){
            firstListNode.next = ListNode(newL1.value)
            newL1 = newL1.next
        }else{
            firstListNode.next = ListNode(newL2.value)
            newL2 = newL2.next
        }
    }
    return null
}
