package set1;

import java.util.Scanner;

public class QuestionNumber23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter the size");
		int size = sc.nextInt();

		System.out.println("Enter the array:");
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the timeWindow :");
		int timeWindow = sc.nextInt();
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {

				if (Math.abs(arr[i] - arr[j]) <= timeWindow) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
