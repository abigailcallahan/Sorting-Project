import java.util.Scanner;
import java.io.*;
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
		
		static double finalSelection;
		static double finalMerge;
		static double finalQuick;
		static double finalInsertion;
		static double finalBubble;
		
		static ArrayList<TimeSort> results = new ArrayList<TimeSort>();
		

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
						finalSelection = (SelectionSort.futureSelection - SelectionSort.pastSelection) / 1000;
						results.add(new TimeSort("selection sort", finalSelection));
						
						
						MergeSortDemo.pastMerge = System.currentTimeMillis();
						MergeSortDemo.mergeSort(mSortArray, mSortArray.length);
						MergeSortDemo.futureMerge = System.currentTimeMillis();
						finalMerge = (MergeSortDemo.futureMerge - MergeSortDemo.pastMerge) / 1000;
						results.add(new TimeSort("merge sort", finalMerge));
						
						QuicksortInt.pastQuick = System.currentTimeMillis();
						QuicksortInt.qsort(qSortArray);
						QuicksortInt.futureQuick = System.currentTimeMillis();
						finalQuick = (QuicksortInt.futureQuick - QuicksortInt.pastQuick) / 1000;
						results.add(new TimeSort("quick sort", finalQuick));
						
						
						InsertionSort.pastInsertion = System.currentTimeMillis();
						InsertionSort.insertionSort(iSortArray);
						InsertionSort.futureInsertion = System.currentTimeMillis();
						finalInsertion = (InsertionSort.futureInsertion - InsertionSort.pastInsertion) / 1000;
						results.add(new TimeSort("insertion sort", finalInsertion));
						
						BubbleSort.pastBubble = System.currentTimeMillis();
						BubbleSort.bubbleSort(bArray);
						BubbleSort.futureBubble = System.currentTimeMillis();
						finalBubble = (BubbleSort.futureBubble - BubbleSort.pastBubble) / 1000;
						results.add(new TimeSort("bubble sort", finalBubble));
					
			
				
				printFinal();
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
			
			Collections.sort(results, new TimeSorter());
			for(TimeSort t : results)
				{
					System.out.println();
					//15 spaces for this
					System.out.printf("%-25s", t.getSortMethod() + ": ");
					//6 spaces for this
					System.out.printf("%-6s", t.getTime());
		
				}
			
		}
		
	}
