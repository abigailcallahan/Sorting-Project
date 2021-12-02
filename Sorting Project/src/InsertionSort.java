import java.util.Date;

public class InsertionSort
	{
		static Date pastInsertion;
		static Date futureInsertion;
		
		static long finalInsertion;
		
		public static void insertionSort(int[ ] elements)
			{
				pastInsertion = new Date();
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
			 		futureInsertion = new Date();
					
					finalInsertion = futureInsertion.getTime() - pastInsertion.getTime();
			 }
			 	
			 		
			}
	}
