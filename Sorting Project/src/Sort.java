import java.util.Scanner;

public class Sort
	{
		static String enter;
		static Scanner input = new Scanner(System.in);
		static int numSim;
		static int numOfNums;
		static int nums;

		public static void main(String[] args)
			{
				askParameters();
				generateNums();
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
			for(int i = 0; i < numOfNums; i++)
				{
					nums = (int)(Math.random() * 89) + 10;
					System.out.println(nums);
				}
			
		}
		
	}
