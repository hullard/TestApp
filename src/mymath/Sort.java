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
					double tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
	}
}
