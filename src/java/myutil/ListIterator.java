package java.myutil;

public interface ListIterator<E> extends Iterator<E> 
{
	void add(E element);
	boolean hasPrevious();
	int nextIndex();
	E previous();
	int previousIndex();
	void set(E element);
}
