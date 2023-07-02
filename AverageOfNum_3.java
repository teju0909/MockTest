package JavaMockTest_1;

import java.util.Scanner;

public class AverageOfNum_3 {

	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        int numberCount = 0;
	        int sum = 0;

	        System.out.println("Enter a number: ");
	        int number = scan.nextInt();

	        do {
	            sum += number;
	            numberCount++;

	            System.out.println("Enter a number (or press -1 to get the Average): ");
	            number = scan.nextInt();
	        } while (number != -1);

	        float average = (float) sum / numberCount;
	        System.out.println("The average is: " + average);
	    }
	}