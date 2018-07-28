package mymath;

public class ArrayOperations
{
	public static <E> void print(E[] array)
	{		
		for (E element : array)
		{
			System.out.print(element + "  ");
		}
		System.out.println();
	}
	
	public static <E> void swap(E[] array, int i, int j)
	{
		E temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
