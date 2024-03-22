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
        ListNode low=head,fast=head,prev,temp;
        while(fast!=null && fast.next!=null){
            low=low.next;
            fast=fast.next.next;
        }
        prev=low;
        low=low.next;
        prev.next=null;
        while(low!=null){
            temp=low.next;
            low.next=prev;
            prev=low;
            low=temp;
        }
        fast=head;
        low=prev;
        while(low!=null){
            if(fast.val!=low.val)
            return false;
            fast=fast.next;
            low=low.next;
        }
        return true;
    }
}