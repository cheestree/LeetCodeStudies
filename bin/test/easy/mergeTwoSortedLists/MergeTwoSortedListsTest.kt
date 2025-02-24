package mergeTwoSortedLists

import easy.mergeTwoSortedLists.ListNode
import easy.mergeTwoSortedLists.mergeTwoLists
import kotlin.test.Test
import kotlin.test.assertEquals

class MergeTwoSortedListsTest {

    @Test
    fun mergeTwoSortedListsTest1() {
        val arr1 = ListNode(1)
        arr1.next = ListNode(2)
        arr1.next!!.next = ListNode(4)
        val arr2 = ListNode(1)
        arr2.next = ListNode(3)
        arr2.next!!.next = ListNode(4)
        val output = mergeTwoLists(arr1, arr2)
        val correctOutput = ListNode(1)
        correctOutput.next = ListNode(1)
        correctOutput.next!!.next = ListNode(2)
        correctOutput.next!!.next?.next = ListNode(3)
        correctOutput.next!!.next?.next?.next = ListNode(4)
        correctOutput.next!!.next?.next?.next?.next = ListNode(4)
        assertListNodeEquals(correctOutput, output)
    }

    @Test
    fun mergeTwoSortedListsTest2() {
        val arr1: ListNode? = null
        val arr2: ListNode? = null
        val output = mergeTwoLists(arr1, arr2)
        assertEquals(null, output)
    }

    @Test
    fun mergeTwoSortedListsTest3() {
        val arr1: ListNode? = null
        val arr2 = ListNode(0)
        val output = mergeTwoLists(arr1, arr2)
        val correctOutput = ListNode(0)
        assertListNodeEquals(correctOutput, output)
    }

    // Helper function to compare two linked lists
    private fun assertListNodeEquals(expected: ListNode?, actual: ListNode?) {
        var expectedNode = expected
        var actualNode = actual

        while (expectedNode != null || actualNode != null) {
            assertEquals(expectedNode?.`val`, actualNode?.`val`)
            expectedNode = expectedNode?.next
            actualNode = actualNode?.next
        }
    }
}