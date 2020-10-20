package com.formation.java;

/**
 * @author Admin
 */
public class Node {
	private Node left, right;
	private int value;

	public Node(int value) {
		left = null;
		right = null;
		this.value = value;
	}

	public static void main(String[] args) {
		Node small = new Node(9);
		Node large = new Node(100000);

		Node n = small.find(9);
		System.out.println("find returns "+ n.value);
		n = large.find(100000);
		System.out.println("find returns "+ n.value);
	}


	public Node find(int v) {
		Node current = this;
		// Keep navigating down the tree until either we've run
		// out of nodes to look at, or we've found the right value.
		while (current != null && current.value != v) {
			current = v < current.value ? current.left : current.right;
		}
		return current;
	}
}
