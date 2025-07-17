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
    ArrayList<Integer> list1=new ArrayList<>();
    ArrayList<Integer> list2=new ArrayList<>();
    
    public boolean isSymmetric(TreeNode root) {
     if(root==null) return true;
        leftR(root.left);
        rightR(root.right);
      

 if(list1.equals(list2)) return true;
 return false;

        
    }
   
    public void leftR(TreeNode root){
        if(root!=null){
        list1.add(root.val);
        leftR(root.left);
        leftR(root.right);
        }
        else{
            list1.add(null);
        }
    }
     
    public void rightR(TreeNode root){
        if(root!=null){
        list2.add(root.val);
        rightR(root.right);
        rightR(root.left);
        }
        else{
            list2.add(null);
        }
    }
  
}