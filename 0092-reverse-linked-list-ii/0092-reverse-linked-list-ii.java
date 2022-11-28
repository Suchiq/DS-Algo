/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        int i = 0;
        ListNode prev = null;
        ListNode current = head;

        for (i = 1; i < left; i++) {
            prev = current;
            current = current.next;
        }
        ListNode prev1 = null, next = null;
        ListNode tailPtr = current;

        while (i <= right) {
            next = current.next;
            current.next = prev1;
            prev1 = current;
            current = next;
            i++;
        }
        //prev1 reurns reverse list

        if (prev != null) {
            prev.next = prev1;
        } else {
            head = prev1;
        }
        tailPtr.next = current;
        return head;
    }
}
