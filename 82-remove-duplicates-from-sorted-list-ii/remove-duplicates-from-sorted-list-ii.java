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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode i = dummy;
        ListNode j = head;
        while(j!=null){
            if(j.next!=null && j.val == j.next.val){
                while(j.next!=null && j.val == j.next.val){
                    j = j.next;
                }
                i.next = j.next;
            }
            else{
                i = i.next;
            }
            j = j.next; 
        }
        return dummy.next;
    }
}