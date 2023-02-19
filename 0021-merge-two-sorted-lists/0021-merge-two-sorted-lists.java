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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1 = list1;
        ListNode p2 = list2;

        ListNode list3 = new ListNode(0);
        ListNode current = list3;

        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                current.next = new ListNode(p1.val);
                p1 = p1.next;
            } else {
                current.next = new ListNode(p2.val);
                p2 = p2.next;
            }
            current =  current.next;
        }
        if (p1 != null) {
            current.next = p1;
        }
        if (p2 != null) {
            current.next = p2;
        }
        return list3.next;
    }
}
