package java.myutil;

public abstract class AbstractCollection<E> extends Object implements Collection<E>
{
	protected AbstractCollection() {};
	
	public abstract Iterator<E> iterator();
	
	boolean hasNext()
	{
		return true;
	}
	
	E next()
	{
		return null;
	}

	public abstract int size();
}
