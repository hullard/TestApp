package java.myutil;

public interface List<E> extends Collection<E> 
{
	void add(int index, E element);
	boolean addAll(int index, Collection<? extends E> collection);
	E get(int index);
	int indexOf(Object object);
	int lastIndexOf(Object object);
	ListIterator<E> listIterator();
	ListIterator<E> listIterator(int index);
	E set(int index, E element);
	List<E> subList(int fromIndex, int toIndex);
}