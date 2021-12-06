


public class SelectionSort
	{
		static double pastSelection;
		static double futureSelection;
		

		
		static double finalSelection;
		
		public static void selectionSort(int[] elements)
			{
				
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
				
				
				finalSelection = (futureSelection - pastSelection) / 1000;
				
				
			}
	}
