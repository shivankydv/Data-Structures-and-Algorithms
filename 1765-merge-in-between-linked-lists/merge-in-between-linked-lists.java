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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode t1 = list1;
        for(int i=0;i<a-1;i++){
            t1 = t1.next;
        }
        ListNode t2 = t1;
        for(int i=0;i<b-a+2;i++){
            t2 = t2.next;
        }
        ListNode tail = list2;
        while(tail.next!=null){
            tail = tail.next;
        }
        t1.next = list2;
        tail.next = t2;
        return list1;

    }
}