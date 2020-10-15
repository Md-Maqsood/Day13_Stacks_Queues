package com.BridgeLabs.StacksAndQueues;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {
	
	@Test
	public void giventhreeNumbersWhenAddedToQueueShouldHaveFirstAddedNode() {
		Queue<Integer> queue = new Queue<Integer>();
		MyNode<Integer> node1 = new MyNode<Integer>(56);
		MyNode<Integer> node2 = new MyNode<Integer>(30);
		MyNode<Integer> node3 = new MyNode<Integer>(70);
		queue.enqueue(node3);
		queue.enqueue(node2);
		queue.enqueue(node1);
		INode myNode = queue.peak();
		queue.printQueue();
		Assert.assertEquals(node3,myNode);
	}
	
	@Test
	public void giventhreeNumbersWhenAddedToQueueAndDequeuedShouldReturnFirstAddedNode() {
		Queue<Integer> queue = new Queue<Integer>();
		MyNode<Integer> node1 = new MyNode<Integer>(56);
		MyNode<Integer> node2 = new MyNode<Integer>(30);
		MyNode<Integer> node3 = new MyNode<Integer>(70);
		queue.enqueue(node3);
		queue.enqueue(node2);
		queue.enqueue(node1);
		INode myNode = queue.dequeue();
		queue.printQueue();
		Assert.assertEquals(node3,myNode);
	}
}
