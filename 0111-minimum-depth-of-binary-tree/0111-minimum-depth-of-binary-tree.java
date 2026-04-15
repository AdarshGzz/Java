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
   
    // public int minDepth(TreeNode root) {
    //     if(root==null) return 0;

    //     if(root.left==null){
    //         return minDepth(root.right)+1;
    //     }

    //     if(root.right==null){
    //         return minDepth(root.left)+1;
    //     }

    //     return 1+Math.min(minDepth(root.left),minDepth(root.right));
    // }


    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 1;

        while(!q.isEmpty()){
            int size = q.size();
            while(size>0){
                TreeNode curr= q.poll();
                if(curr.left==null && curr.right==null){
                    return depth;
                }

                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
                size--;
            }
            depth++;
        }
        return depth;

    }
}