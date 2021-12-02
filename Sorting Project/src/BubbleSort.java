import java.util.Date;

public class BubbleSort
	{
		static Date pastBubble;
		static Date futureBubble;
		
		static long finalBubble;
		
		public static void bubbleSort(int[] arr) 
			{
				pastBubble = new Date();
				
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
		        futureBubble = new Date();
				
				finalBubble = futureBubble.getTime() - pastBubble.getTime();
		    }  
	}
