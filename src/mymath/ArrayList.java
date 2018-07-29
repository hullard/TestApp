package mymath;

import java.util.Arrays;

public class ArrayList<E> implements Cloneable
{
	private static final int INIT_SIZE = 16;
	private E[] array;
	private int listLength = 0;
	private int arrayLength = INIT_SIZE;
	
	public ArrayList(int capacity) 	
	{
		@SuppressWarnings("unchecked")
		final E[] array = (E[]) new Object[capacity];
		this.array = array;
	}
	
	public ArrayList() 
	{
		this(INIT_SIZE);
	}
	
	public void append(E item)
	{
		if (this.listLength == this.arrayLength)
		{
			this.arrayLength *= 2;
			this.array = Arrays.copyOf(this.array, this.arrayLength);
		}
		this.array[this.listLength++] = item;
	}
	
	public E getItem(int idx)
	{ 
		return this.array[idx]; 
	}
	
	public void setItem(E item, int idx) 
	{
		this.array[idx] = item;
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
