package BinaryTree;

import java.util.Stack;

public class PostOrder {
	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	public static void postOrder(TreeNode root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.printf("%d ", root.data);
		}
	}
	
	public static void postOrderIter(TreeNode root) {
		if (root == null) {
			return;
		}
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode current = root;
		while( true ) {
			 
			if( current != null ) {
				if( current.right != null ) 
					stack.push( current.right );
				stack.push( current );
				current = current.left;
				continue;
			}
 
			if( stack.isEmpty( ) ) 
				return;
			current = stack.pop( );
 
			if( current.right != null && ! stack.isEmpty( ) && current.right == stack.peek( ) ) {
				stack.pop( );
				stack.push( current );
				current = current.right;
			} else {
				System.out.print( current.data + " " );
				current = null;
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
		
		postOrder(rootNode);
		System.out.println("\n");
		postOrderIter(rootNode);
	}
	
}
