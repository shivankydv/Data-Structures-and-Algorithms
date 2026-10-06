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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(ListNode head : lists){
            ListNode temp = head;
            while(temp!=null){
                ans.add(temp.val);
                temp = temp.next;
            }
        }
        Collections.sort(ans);
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for(int temp : ans){
            tail.next = new ListNode(temp);
            tail = tail.next;
        }
        return dummy.next;
    }
}