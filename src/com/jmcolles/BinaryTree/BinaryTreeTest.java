package com.jmcolles.BinaryTree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		int[] nums = { 8, 4, 9, 1, 2, 5, 11, 10 };
		for (int num : nums) {
			bt.add(num);
		}
		System.out.println(bt.root.display());
	}
}
