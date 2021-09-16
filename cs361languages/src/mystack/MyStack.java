/**
 * 
 */
package mystack;

/**
 * @author Edric Chai
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() throws NullPointerException{
		// TODO To complete :)
		MyNode<T> holder = theStack;
		theStack = theStack.next;
		return holder.val;
	}

	public void push(T v) {
		// TODO To complete :)
		MyNode<T> addStack = new MyNode<T>(v, theStack);
		theStack = addStack;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete :)
		// Create a stack of Integer
		MyStack<Integer> i = new MyStack<Integer>();
		// Push 1 and 2
		i.push(1);
		i.push(2);
		// Pop
		System.out.println(i.pop());
		// Push 5
		i.push(5);
		
		// TODO To complete :)
		// Create a stack of Person
		MyStack<String> person = new MyStack<String>();
		// Push a person p1 with your name
		person.push("Edric");
		// Push a person p2 with my name
		person.push("Christelle");
		System.out.println(person.pop());
	}

}
