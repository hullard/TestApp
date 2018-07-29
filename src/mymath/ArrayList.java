package mymath;

import java.util.Arrays;

public class ArrayList<E> implements Cloneable
{
	private static final int INIT_CAPACITY = 8;
	private int capacity;
	private int size = 0;
	private E[] array;
	
	public ArrayList(int capacity) 	
	{
		@SuppressWarnings("unchecked")
		final E[] array = (E[]) new Object[capacity];
		this.capacity = capacity; 
		this.array = array;
	}
	
	public ArrayList() 
	{
		this(INIT_CAPACITY);
	}
	
	public void append(E item)
	{
		if (this.size == this.capacity)
		{
			this.capacity *= 2;
			this.array = Arrays.copyOf(this.array, this.capacity);
		}
		this.array[this.size++] = item;
	}
	
	public E getItem(int idx)
	{ 
		return this.array[idx]; 
	}
	
	public void setItem(E item, int idx) 
	{
		this.array[idx] = item;
	}
	
	public int size()
	{
		return this.size;
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
