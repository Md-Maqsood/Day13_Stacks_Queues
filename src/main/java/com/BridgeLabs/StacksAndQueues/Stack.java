package com.BridgeLabs.StacksAndQueues;

public class Stack<K> {
	LinkedList<K> linkedList;

	public Stack() {
		this.linkedList = new LinkedList<K>();
	}

	public int size() {
		return linkedList.size();
	}

	public void printStack() {
		linkedList.printList();
	}

	public void push(INode<K> newNode) {
		linkedList.add(newNode);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		MyNode<Integer> node1 = new MyNode<Integer>(56);
		MyNode<Integer> node2 = new MyNode<Integer>(30);
		MyNode<Integer> node3 = new MyNode<Integer>(70);
		stack.push(node3);
		stack.push(node2);
		stack.push(node1);
		stack.printStack();
	}

}
