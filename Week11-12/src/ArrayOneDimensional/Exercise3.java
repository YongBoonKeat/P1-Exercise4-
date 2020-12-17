package ArrayOneDimensional;
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
//Question 3
		//Write a program that creates an array of 10 elements size. 
		//Your program should prompt the user to input numbers in array and then display the sum of all array elements.
		
		int[] numbers = new int[10];
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter numbers: ");
		
		for(int i=0; i<numbers.length ;i++) {
			numbers[i] = in.nextInt();
	}
		for(int i=0; i<numbers.length ;i++) {
			System.out.println(numbers[i]);
	}
		int sum = 0;
		
		for (int i=0; i<numbers.length ;i++) {
			sum += numbers[i];
		}
		System.out.print("Sum numbers equals to " + sum);
}
}