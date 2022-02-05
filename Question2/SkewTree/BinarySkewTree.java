package com.gl.Question2.SkewTree;

import com.gl.Question2.SkewTree.TreeDriver.Node;

public class BinarySkewTree {

	static Node prevNode = null;
	static Node headNode = null;
	

	public Node skewedTree(Node root, int val) {
		
		if (root == null) {
			return null;
		}
		
		if (val > 0) {
			skewedTree(root.right, val);
		} else {
			skewedTree(root.left, val);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		
		if (val > 0) {
			skewedTree(leftNode, val);
		} else {
			skewedTree(rightNode, val);
		}
		return headNode;
	}

	
	public void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}
}
