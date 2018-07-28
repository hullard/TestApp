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
	
	Node(T item) { this(item, null); }
	
	T getItem() { return this.item; }
	
	Node<T> getOther() { return this.other; }
	
	void setItem(T item) { this.item = item; }
	
	void setOther(Node<T> other) { this.other = other; }
}

public class NodeStack<T> implements Cloneable
{	
	Node<T> top;
	
	public NodeStack() { }

	public void push(T item) 
	{	
		this.top = new Node<T>(item, this.top);
	}
	
	public T pop()
	{
		T item = this.top.getItem();
		this.top = this.top.getOther();
		return item;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
