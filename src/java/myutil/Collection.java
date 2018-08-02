package java.myutil;

public interface Collection<E> extends Iterable<E>  
{
	boolean add(E element);
	boolean addAll(Collection<? extends E> collection);
	void clear();
	boolean contains(Object object);
	boolean containsAll(Collection<?> collection);
	boolean equals(Object object);
	int hashCode();
	boolean isEmpty();
	boolean remove(Object object);
	boolean removeAll(Collection<E> collection);
	boolean retainAll(Collection<E> collection);
	int size();
	Object[] toArray();
	<T> T[] toArray(T[] array);
}

