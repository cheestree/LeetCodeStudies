package mergeTwoSortedLists

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class MergeTwoSortedListsTest{
    @Test
    fun mergeTwoSortedListsTest1(){
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
        assertEquals(correctOutput, output)
    }

    @Test
    fun mergeTwoSortedListsTest2(){
        val arr1 = null
        val arr2 = null
        val output = mergeTwoLists(arr1, arr2)
        val correctOutput = null
        assertEquals(correctOutput, output)
    }

    @Test
    fun mergeTwoSortedListsTest3(){
        val arr1 = null
        val arr2 = ListNode(0)
        val output = mergeTwoLists(arr1, arr2)
        val correctOutput = ListNode(0)
        //assertContentEquals(correctOutput, output)
    }
}