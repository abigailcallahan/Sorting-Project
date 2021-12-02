import java.util.Date;

public class SelectionSort
	{
		static Date pastSelection;
		static Date futureSelection;
		
		static long finalSelection;
		
		public static void selectionSort(int[] elements)
			{
				pastSelection = new Date();
				for (int j = 0; j < elements.length - 1; j++)
					{
						int minIndex = j;
						for (int k = j + 1; k < elements.length; k++)
							{
								if (elements[k] < elements[minIndex])
									{
					 				minIndex = k;
					 				}
							}
						int temp = elements[j];
					 	elements[j] = elements[minIndex];
					 	elements[minIndex] = temp;
					}
				futureSelection = new Date();
				
				finalSelection = futureSelection.getTime() - pastSelection.getTime();
			}
	}
