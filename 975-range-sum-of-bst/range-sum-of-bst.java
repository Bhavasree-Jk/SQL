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
     int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
      range(root,low,high);
     int ans=sum;
     return ans;
    }
      public int range(TreeNode root,int low,int high){
        
        if(root==null){
            return 0;
        }
        else if(root.val<=high&&root.val>=low){
            sum+=root.val;
         
        }
       
        range(root.left,low,high);
        range(root.right,low,high);
          return sum;
       
      }
}