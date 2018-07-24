package mymath;

public class Sort
{
	public static void bubble(double[] array)
	{
		int MAX_SIZE = array.length;
		
		for (int i = 1; i < MAX_SIZE; i++)
		{
			for (int j = 0; j < MAX_SIZE - i; j++)
			{
				if (array[j] > array[j + 1])
				{
					Array.swap(array, j, j + 1);
				}
			}
		}
	}
	
	public static void selection(double[] array)
	{
		int MAX_SIZE = array.length;
		
		for (int i = MAX_SIZE - 1; i > 0; i--)
		{
			int maxIndex = 0;
			for (int j = 0; j < i; j++)
			{
				if (array[j + 1] > array[j])
					maxIndex = j + 1;
			}
			Array.swap(array, i, maxIndex);
		}
	}
}
