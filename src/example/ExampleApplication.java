package example;

import java.util.Scanner;

public class ExampleApplication {

	static void sort(int[] arr) {
		
		int arr2[] = new int[arr.length];
		for(int idx = 0; idx < arr.length; idx++) {
			arr2[idx] = arr[idx];
		}
		
		int temp = arr2[0];
		arr2[0] = arr2[1];
		arr2[1] = arr2[2];
		arr2[2] = temp;
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Size: ");
		int size = scanner.nextInt();

		int arr[] = new int[size];

		for (int index = 0; index < arr.length; index++) {
			System.out.printf("Enter Value %d: ", index + 1);
			int value = scanner.nextInt();
			arr[index] = value;
		}
		
		sort(arr);
		
		
		System.out.println("Entered Values are:");
		for (int i : arr) {
			System.out.printf("Item '%d'\n", i);
		}

		// TODO: How to extend an array
	}

}
