package Github_Projects;

import java.util.Scanner;

public class arraySum {
public static int sumarray(int []arr) {
	int sum = 0;
for(int i=0;i<arr.length;i++){
	sum+=arr[i];
}
	return sum;
}
	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);	
		   // Prompt the user to enter the length of the array
	        System.out.print("Enter the length of the array: ");
	        int length = scanner.nextInt();

	        // Create an array of the specified length
	        int[] arr = new int[length];

	        // Prompt the user to enter the elements of the array
	        System.out.printf("Enter %d integers to fill the array:%n", length);
	        for (int i = 0; i < length; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Call the sum method with the input array and print the result
	        int result =  sumarray(arr);
	        System.out.println("The sum of the array is: " + result);
	}

}
