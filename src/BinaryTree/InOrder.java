package BinaryTree;

import java.util.Stack;

public class InOrder {
	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	// Recursive
	public static void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.printf("%d ", root.data);
			inOrder(root.right);
		}
	}
	
	public static void inOrderIter(TreeNode root) {
		if (root == null) return;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode current = root;
		while(!stack.empty() || current != null) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				TreeNode tn = stack.pop();
				System.out.printf("%d ", tn.data);
				current = tn.right;
			}
		}
	}
	
	public static void main(String[] args) {
		TreeNode rootNode = new TreeNode(40);
		TreeNode node20= new TreeNode(20);
		TreeNode node10= new TreeNode(10);
		TreeNode node30= new TreeNode(30);
		TreeNode node60= new TreeNode(60);
		TreeNode node50= new TreeNode(50);
		TreeNode node70= new TreeNode(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
		
		inOrder(rootNode);
		System.out.println("\n");
		inOrderIter(rootNode);
	}
}
