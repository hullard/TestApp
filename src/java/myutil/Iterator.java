package java.myutil;

public interface Iterator<E> 
{
	boolean hasNext();
	E next();
	void remove();
}
