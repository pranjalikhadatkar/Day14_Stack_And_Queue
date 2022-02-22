package com.StackAndqueues;

public class myLinkedList<K> {
		public INode head;
		public INode tail;

		public myLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void add(INode myNode) {
			if (this.tail == null) {
				this.tail = myNode;
			}
			if (this.head == null) {
				this.head = myNode;
			} else {
				INode tempNode = this.head;
				this.head = myNode;
				this.head.setNext(tempNode);
			}
		}

		public void printMyNode() {
			System.out.println(head);
		}
}
		