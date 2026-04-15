/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void inorder(List<TreeNode> list,TreeNode root){
        if(root==null) return;
        inorder(list,root.left);
        list.add(root);
        inorder(list,root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        List<TreeNode> list = new ArrayList<>();
        inorder( list, root);

        int i=0;
        int j= list.size()-1;
        while(i<j){
            int sum  = (list.get(i)).val + (list.get(j)).val;
            if(sum==k){
                return true;
            }else if(sum<k){
                i++;
            }else{
                j--;
            }
        }

        return false;

    }
}