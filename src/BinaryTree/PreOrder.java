package BinaryTree;

import java.util.Stack;

public class PreOrder {
	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	// Recursive
	public static void preOrder(TreeNode root) {
		if (root != null) {
			System.out.printf("%d ", root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	// Iterative
	public static void preOrderIter(TreeNode root) {
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode el = stack.pop();
			System.out.printf("%d ", el.data);
			
			if (el.right != null) {
				stack.push(el.right);
			}
			if (el.left != null) {
				stack.push(el.left);
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
		
		preOrder(rootNode);
		System.out.println("\n");
		preOrderIter(rootNode);
	}
}
