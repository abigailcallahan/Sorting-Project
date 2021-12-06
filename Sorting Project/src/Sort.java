import java.util.Scanner;
import java.util.Collections;
import java.util.Date;
import java.util.ArrayList;

public class Sort
	{
		static String enter;
		static Scanner input = new Scanner(System.in);
		static double numSim;
		static int numOfNums;
		static int nums;
		static int[] arrayNums;
		
		static int[] sSortArray;
		static int[] iSortArray;
		static int[] qSortArray;
		static int[] mSortArray;
		static int[] bArray;
		
		static ArrayList<TimeSort> results = new ArrayList<TimeSort>();
		//THIS SHOULD BE ARRAYLIST::: static double[] results;
		

		public static void main(String[] args)
			{
				askParameters();
				generateNums();

				sSortArray = arrayNums;
				iSortArray = arrayNums;
				qSortArray = arrayNums;
				mSortArray = arrayNums;
				bArray = arrayNums;
				
				
						SelectionSort.pastSelection = System.currentTimeMillis();
						SelectionSort.selectionSort(sSortArray);
						SelectionSort.futureSelection = System.currentTimeMillis();
						//results.add(new TimeSort("selection sort", SelectionSort.finalSelection))
						System.out.println("seconds for Selection: " + SelectionSort.finalSelection);
						
						MergeSortDemo.pastMerge = System.currentTimeMillis();
						MergeSortDemo.mergeSort(mSortArray, mSortArray.length);
						MergeSortDemo.futureMerge = System.currentTimeMillis();
						//results.add(new TimeSort("merge sort", MergeSortDemo.finalMerge));
						System.out.println("seconds for Merge: " +  MergeSortDemo.finalMerge);
						
						QuicksortInt.pastQuick = System.currentTimeMillis();
						QuicksortInt.qsort(qSortArray);
						QuicksortInt.futureQuick = System.currentTimeMillis();
						//results.add(new TimeSort("quick sort", QuicksortInt.finalQuick));
						System.out.println("seconds for Quick: " + QuicksortInt.finalQuick);
						
						
						InsertionSort.pastInsertion = System.currentTimeMillis();
						InsertionSort.insertionSort(iSortArray);
						InsertionSort.futureInsertion = System.currentTimeMillis();
						//results.add(new TimeSort("insertion sort", InsertionSort.finalMerge));
						System.out.println("seconds for Insertion: " + InsertionSort.finalInsertion);
						
						BubbleSort.pastBubble = System.currentTimeMillis();
						BubbleSort.bubbleSort(bArray);
						BubbleSort.futureBubble = System.currentTimeMillis();
						//results.add(new TimeSort("bubble sort", BubbleSort.finalMerge));
						System.out.println("seconds for Bubble: " + BubbleSort.finalBubble);
						
						
						System.out.println();
			
				
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

//			Collections.sort(results, new TimeSorter());
//			for(TimeSort t : results)
//				{
//					System.out.printf(t.getName() + " " + t.getTime());
//					//printf code
//				}
			
		}
		
	}
