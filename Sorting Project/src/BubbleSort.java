
import java.text.DecimalFormat;

public class BubbleSort
	{
		static double pastBubble;
		static double futureBubble;
		
		static double finalBubble;
		
		public static void bubbleSort(int[] arr) 
			{
				pastBubble = System.currentTimeMillis();
				
				int n = arr.length;  
		        int temp = 0;  
		        for(int i=0; i < n; i++)
		        	{
		        		for(int j=1; j < (n-i); j++)
		        			{
		        				if(arr[j-1] > arr[j])
		        					{
		        						//swap elements
		        						temp = arr[j-1];
		        						arr[j-1] = arr[j];
		        						arr[j] = temp;
		        					}  
		                          
		        			}
		        	}
		        futureBubble = System.currentTimeMillis();
				
				finalBubble = (futureBubble - pastBubble) / Sort.numSim;
		    }  
	}
