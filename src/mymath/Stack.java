package mymath;

class Node<T>
{
	T item;
	Node<T> other;
	
	Node(T item, Node<T> other) 
	{
		this.item = item;
		this.other = other;
	}
	
	T getItem() { return this.item; }
	
	Node<T> getOther() { return this.other; }
	
	void setItem(T item) { this.item = item; }
	
	void setOther(Node<T> other) { this.other = other; }
}

public class Stack<T>
{	
	Node<T> top;
	
	public Stack() { this.top = null; }

	public void push(T item) 
	{
		this.top = new Node<T>(item, this.top);
	}
	
	public T pop()
	{
		if (this.top != null)
		{
			T item = this.top.getItem();
			this.top = this.top.getOther();
			return item;
		}
		else
		{
			throw new java.lang.Error("Stack is empty"); 
		}
	}
}
