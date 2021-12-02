import java.util.Scanner;
import java.util.Date;

public class Sort
	{
		static String enter;
		static Scanner input = new Scanner(System.in);
		static int numSim;
		static int numOfNums;
		static int nums;
		static int[] arrayNums;
		
		static int[] sSortArray;
		static int[] iSortArray;
		static int[] qSortArray;
		static int[] mSortArray;
		static int[] bArray;
		
		static Date past = new Date();
		//sort here
		static Date future = new Date();
		
		//System.out.println("Time (milliseconds) = " + (future.getTime() - past.getTime()));
		
		public static void main(String[] args)
			{
				askParameters();
				
				generateNums();

				sSortArray = arrayNums;
				iSortArray = arrayNums;
				qSortArray = arrayNums;
				mSortArray = arrayNums;
				bArray = arrayNums;
				
				
				for(int i = 0; i < numSim; i++)
					{
						SelectionSort.selectionSort(sSortArray);
						System.out.println("milliseconds for Selection: " + SelectionSort.finalSelection);
						MergeSortDemo.mergeSort(mSortArray, mSortArray.length);
						System.out.println("milliseconds for Merge: " + MergeSortDemo.finalMerge);
						QuicksortInt.qsort(qSortArray);
						System.out.println("milliseconds for Quick: " + QuicksortInt.finalQuick);
						InsertionSort.insertionSort(iSortArray);
						System.out.println("milliseconds for Insertion: " + InsertionSort.finalInsertion);
						BubbleSort.bubbleSort(bArray);
						System.out.println("milliseconds for Bubble: " + BubbleSort.finalBubble);
						
					}			
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
	
		public static void printFinal()
		{
			System.out.println("Number of Simulations: " + numSim);
			System.out.println("Array size: " + numOfNums);

			//print out which is fastest....
		}
		
	}
