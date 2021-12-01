import java.util.Scanner;

public class Sort
	{
		static String enter;
		static Scanner input = new Scanner(System.in);
		static int numSim;
		static int numOfNums;
		static int nums;
		static int[] arrayNums;

		public static void main(String[] args)
			{
				askParameters();
				generateNums();
				
//				for(int i = 0; i < numSim; i++)
//					{
						//quickSort(arrayNums);
						selectionSort(arrayNums);
						//mergeSort();
						insertionSort(arrayNums);
						bubbleSort(arrayNums);
					//}			
				//printFinal();
			}
		
		public static void askParameters()
		{
			System.out.println("Welcome to the Sorting Game!");
			System.out.println("Press enter to start");
			enter = input.nextLine();
			
			System.out.println("How many times should the simulation run?");
			numSim = input.nextInt();
			
			System.out.println("How many numbers should be generated?");
			numOfNums = input.nextInt();
			
		}

		public static void generateNums()
		{
			arrayNums = new int[numOfNums];
			for(int i = 0; i < numOfNums; i++)
				{
					nums = (int)(Math.random() * 89) + 10;
					arrayNums[i] = nums;
				}
			
		}
		
		//does not work
		public static int [ ] quickSort(int items[])
				{
					qs(items, 0, items.length - 1);
					return items;
				}
			private static void qs(int items[], int left, int right)
				{
					int i, j;
					int pivot, temp;
					i = left;
					j = right;
					pivot = items [(left + right) / 2];
					do
						{
							while ((items [i] < pivot) && (i < right))
								i++;
							while ((pivot < items [j]) && (j > left))
								j--;
							if (i <= j)
								{
									temp = items [i];
									items [i] = items [j];
									items [j] = temp;
									i++;
									j--;
									}
							}
					while (i <= j);
					if (left < j)
						qs (items, left, j);
					if (i < right)
						qs (items, i, right);
					
					
					for(int a = 0; a < items.length; a++)
						{
							System.out.println(items[a]);
						}
					}
			
		

		//works
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
//			for(int i = 0; i < elements.length; i++)
//				{
//					System.out.println(elements[i]);
//				}
		}
		
		//works
		public static void insertionSort(int[ ] elements)
			{
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
			 }
			 	
//			 	for(int i = 0; i < elements.length; i++)
//			 		{
//			 			System.out.println(elements[i]);
//			 		}
			}

		//works
		public static void bubbleSort(int[] arr) 
			{
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
//		        for(int i = 0; i < arr.length; i++)
//		        	{
//		        		System.out.println(arr[i]);
//		        	}
		    }  
		
		public static void printFinal()
		{
			System.out.println("Number of Simulations: " + numSim);
			System.out.println("Array size: " + numOfNums);

			//print out which is fastest....
		}
		
	}
