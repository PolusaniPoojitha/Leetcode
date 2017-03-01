/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null) return null;
        ListNode nodeA=headA;
        ListNode nodeB=headB;
        HashMap<ListNode, Integer> map= new HashMap<ListNode, Integer>();
        while(nodeA!=null)
        {
            map.put(nodeA, 0);
        }
        while(nodeB!=null)
        {
            if(map.containsKey(nodeB))
            return nodeB;
        }
        return null;
    }
}