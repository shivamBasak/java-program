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
    public void reorderList(ListNode head) {
       ListNode fp = head, sp = head;
       while(fp.next != null && fp.next.next != null){
        sp=sp.next;
        fp=fp.next.next;
       } 
       ListNode cu=sp.next;
       sp.next=null;
       ListNode p=null;
       while(cu!=null){
        ListNode t=cu.next;
        cu.next=p;
        p=cu;
        cu=t;
       }
       cu=head;
       while(p!=null){
        ListNode t=p.next;
        p.next=cu.next;
        cu.next=p;
        cu=p.next;
        p=t;
       }

    }
}