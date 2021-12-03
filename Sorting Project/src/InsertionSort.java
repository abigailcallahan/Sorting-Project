
import java.text.DecimalFormat;

public class InsertionSort
	{
		static double pastInsertion;
		static double futureInsertion;
		
		static double finalInsertion;
		
		public static void insertionSort(int[ ] elements)
			{
				pastInsertion = System.currentTimeMillis();
			 	for (int i = 1; i < elements.length; i++)
			 		{
			 		int temp = elements[i];
			 int possibleIndex = i;
			 while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
			 			{
			 			elements[possibleIndex] = elements[possibleIndex - 1];
			 			possibleIndex--;
			 			}
			 		elements[possibleIndex] = temp;
			 		
			 		futureInsertion = System.currentTimeMillis();
					
					finalInsertion = (futureInsertion - pastInsertion) / Sort.numSim;
			 }
			 	
			 		
			}
	}
