package com.BridgeLabs.StacksAndQueues;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Queue<K> {
	private static final Logger logger = LogManager.getLogger(Queue.class);
	LinkedList<K> linkedList = new LinkedList<K>();

	public Queue() {
		this.linkedList = new LinkedList<K>();
	}

	public int size() {
		return linkedList.size();
	}

	public boolean isEmpty() {
		return linkedList.isEmpty();
	}

	public void printQueue() {
		linkedList.printList();
	}

	public void enqueue(INode<K> newNode) {
		this.linkedList.append(newNode);
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		MyNode<Integer> node1 = new MyNode<Integer>(56);
		MyNode<Integer> node2 = new MyNode<Integer>(30);
		MyNode<Integer> node3 = new MyNode<Integer>(70);
		queue.enqueue(node1);
		queue.enqueue(node2);
		queue.enqueue(node3);
		logger.debug("Queue: ");
		queue.printQueue();
	}
}
