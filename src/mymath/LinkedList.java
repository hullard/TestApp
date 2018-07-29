package mymath;

public class LinkedList<T> implements Cloneable
{
	private Node<T> head;
	
	public LinkedList() { }
	
	public void append(T item)
	{
		Node<T> newNode = new Node<T>(item);
		if (this.head == null)
		{
			this.head = newNode;
		}
		else
		{
			Node<T> node = this.head;
			while (!node.getOther().equals(null))
			{
				node = node.getOther();
			}
			node.setOther(newNode);
		}
	}
	
	public T getItem(int idx)
	{
		Node<T> node = this.head;
		for (int i = 0; i < idx; i++)
		{
			node = node.getOther();
		}
		return node.getItem();
	}
	
	public void setItem(int idx, T item)
	{
		Node<T> node = this.head;
		for (int i = 0; i < idx; i++)
		{
			node = node.getOther();
		}
		node.setItem(item);
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
