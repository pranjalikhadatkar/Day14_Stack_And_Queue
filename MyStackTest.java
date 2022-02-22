package com.StackAndqueues;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

public class MyStackTest {
	private Object popNode;


	@Test
	public void given3NumberWhenAddedToStackShouldHaveLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode peak = myStack.peak();
		myStack.printStack();
		Assert.assertEquals(myThirdNode,peak);
	}
	
	
	@Test
	public void given3NumbersInStackWhenpopedShouldMatchWithLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode popedNode = myStack.pop();
		myStack.printStack();
		Assert.assertEquals(myThirdNode, popNode);
	}
}
	