package ArrayProject;

import java.util.Scanner;

public class FindNoOfAverageTempDays {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("How many days temp ?");
		int numDays = console.nextInt();
		int[] temps = new int[numDays];
		//record temp and find average temp
		int sum=0;
		for(int index =0; index< numDays ;index++)
		{
			System.out.print("Enter "+ (index+1) + "st Day high temp :");
			temps[index] =console.nextInt();
			sum += temps[index];
		}
		
		double average = sum/numDays;
		
		//count days above average
		int count =0;
		for(int index =0; index<temps.length ; index++)
		{
			
			if(temps[index] > average)
			{
				count++;
			}
		}
		System.out.println();
		System.out.println("Avearge Temp :"+ average);
		System.out.println(count +"days above average");

	}

}
