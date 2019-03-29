package com.jmcolles.BinaryTree;

public class Node {
	Node left;
	Node right;
	int value;

	public Node(int value) {
		this.value = value;
		right = null;
		left = null;
	}

	public boolean hasLeftChild() {
		return left != null;
	}

	public boolean hasRightChild() {
		return right != null;
	}

	public String display() {
		String result = "";
		if (hasLeftChild())
			result += left.display();
		result += value + ", ";
		if (hasRightChild())
			result += right.display();
		return result;
	}
}