package com.StackAndqueues;

public class MyStack {
		private final myLinkedList myLinkedList;

		public MyStack() {
			this.myLinkedList = new myLinkedList();
		}

		public void push(INode myNode) {
			myLinkedList.add(myNode);
		}
		
		public INode peak() {
			return myLinkedList.head;
		}

		public void printStack() {
			myLinkedList.printMyNode();
		}

		
}