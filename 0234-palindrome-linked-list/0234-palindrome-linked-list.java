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
    public boolean checkPalindrome(List<Integer> res){
        if(res.size()==1) return true;
        int i=0;
        int j =res.size()-1;
        while(i<j){
            if(res.get(i)!=res.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        List<Integer> res = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            res.add(curr.val);
            curr = curr.next;
        }
        return checkPalindrome(res);
    }
}