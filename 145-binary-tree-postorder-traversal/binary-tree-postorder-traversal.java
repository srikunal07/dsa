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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorderTraversal(root, list);
        return list;
    }

    void postorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        postorderTraversal(node.left, list); // Traverse the left subtree
        postorderTraversal(node.right, list); // Traverse the right subtree
        list.add(node.val); // Visit the root node
    }
}