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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode d=new ListNode(0,head);
        Map<Integer,ListNode> l=new HashMap<>();
        int s=0;
        ListNode c= d;
        while(c!=null){
            s+=c.val;
            l.put(s,c);
            c=c.next;
        }
        s=0;
        c=d;
        while(c!=null){
            s+=c.val;
            c.next=l.get(s).next;
            c=c.next;
        }
        return d.next;
    }
}