package mymath;

public class Array
{
	public static void print(double[] array)
	{		
		for (double element : array)
		{
			System.out.print(element + "  ");
		}
		System.out.println();
	}
	
	public static void swap(double[] array, int i, int j)
	{
		double temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
