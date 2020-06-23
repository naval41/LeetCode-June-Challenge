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
    public int countNodes(TreeNode root) {

		int lHeight = leftDepth(root);  //find left subtree height
		int rHeight = rightDepth(root); //find right subtree height

		if (lHeight == rHeight)
			return (1 << lHeight) - 1;
		else
			return 1+countNodes(root.left) + countNodes(root.right);

	}

	private int rightDepth(TreeNode root) {
		int dep = 0;
		while (root != null) {
			root = root.right;
			dep++;
		}
		return dep;
	}

	private int leftDepth(TreeNode root) {
		int dep = 0;
		while (root != null) {
			root = root.left;
			dep++;
		}
		return dep;
	}
}
