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

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode curr = head;
        ListNode mid = findMid(head);
        ListNode last = null;
        if (mid.next != null) {
            last = findReverse(mid);
        } else {
            last = mid;
        }

        //find mid

        // last - reverse list
        //current then compare

        //System.out.println(curr.val);
       // System.out.println(last);
      //  System.out.println(mid.next.val);

        while (last != null) {
            if (curr.val != last.val) {
                return false;
            }
            last = last.next;
            curr = curr.next;
        }
        return true;
    }

    public ListNode findReverse(ListNode node) {
        ListNode prev = null;
        ListNode cur = node;
        ListNode next = null;
       
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        // System.out.println(cur.val);

        return prev;
    }

    public ListNode findMid(ListNode node) {
        ListNode slowptr = node;
        ListNode fastptr = node;
        while (fastptr != null && fastptr.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        return slowptr;
    }
}
