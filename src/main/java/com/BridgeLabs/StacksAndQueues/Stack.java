package com.BridgeLabs.StacksAndQueues;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Stack<K> {
	private static final Logger logger = LogManager.getLogger(Stack.class);
	LinkedList<K> linkedList;

	public Stack() {
		this.linkedList = new LinkedList<K>();
	}

	public int size() {
		return linkedList.size();
	}
	
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}

	public void printStack() {
		linkedList.printList();
	}

	public void push(INode<K> newNode) {
		linkedList.add(newNode);
	}
	
	public INode<K> peak(){
		return linkedList.head;
	}
	
	public INode<K> pop(){
		return linkedList.pop();
	}
	
	public void popTillEmpty() {
		while(!isEmpty()) {
			logger.debug("Peaked Element: "+peak().getKey()+"\n");
			logger.debug("Popped Element: "+pop().getKey()+"\n");
			logger.debug("\n");
		}
		logger.debug("Stack is empty.");
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
		stack.popTillEmpty();
	}

}
