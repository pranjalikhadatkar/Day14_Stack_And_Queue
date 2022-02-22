package com.StackAndqueues;

public class MyStack {
		private final myLinkedList myLinkedList;
		private INode mydequeueNode;

		public MyStack() {
			this.myLinkedList = new myLinkedList();
		}

		public void push(INode myNode) {
			myLinkedList.add(myNode);
		}
		
		public INode peak() {
			return myLinkedList.head;
		}
		
		public INode pop() {
			return myLinkedList.pop();
		}
		
		public INode enqueue(MyNode<Integer> myenqueueNode) {
			return myLinkedList.enqueue(myenqueueNode);
		}
		
		public INode dequeue() {
			return myLinkedList.dequeue(mydequeueNode);
		}		

		public void printStack() {
			myLinkedList.printMyNode();
		}

		public void dequeue(MyNode<Integer> myFirstNode) {
			// TODO Auto-generated method stub
			
		}

		
}