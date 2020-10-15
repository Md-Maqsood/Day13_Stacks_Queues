package com.BridgeLabs.StacksAndQueues;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {
	
	@Test
	public void giventhreeNumbersWhenAddedToStackShouldHaveLastAddedNode() {
		Stack<Integer> stack = new Stack<Integer>();
		MyNode<Integer> node1 = new MyNode<Integer>(56);
		MyNode<Integer> node2 = new MyNode<Integer>(30);
		MyNode<Integer> node3 = new MyNode<Integer>(70);
		stack.push(node3);
		stack.push(node2);
		stack.push(node1);
		INode myNode = stack.peak();
		stack.printStack();
		Assert.assertEquals(node1,myNode);
	}
	
	@Test
	public void giventhreeNumbersWhenAddedToStackAndPoppedShouldReturnLastAddedNode() {
		Stack<Integer> stack = new Stack<Integer>();
		MyNode<Integer> node1 = new MyNode<Integer>(56);
		MyNode<Integer> node2 = new MyNode<Integer>(30);
		MyNode<Integer> node3 = new MyNode<Integer>(70);
		stack.push(node3);
		stack.push(node2);
		stack.push(node1);
		INode myNode = stack.pop();
		stack.printStack();
		Assert.assertEquals(node1,myNode);
	}
}
