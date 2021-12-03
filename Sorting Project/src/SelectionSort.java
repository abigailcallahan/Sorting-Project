
import java.text.DecimalFormat;


public class SelectionSort
	{
		static double pastSelection;
		static double futureSelection;
		

		
		static double finalSelection;
		
		public static void selectionSort(int[] elements)
			{
				pastSelection = System.currentTimeMillis();
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
				futureSelection = System.currentTimeMillis();
				
				finalSelection = (futureSelection - pastSelection) / Sort.numSim;
				
				//d = new DecimalFormat("0.00000");
				
			}
	}
