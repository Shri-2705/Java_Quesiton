package set1;

import java.util.Scanner;

public class QuestionNumber11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of queries: ");
		int n = sc.nextInt();

		int[] start = new int[n];
		int[] end = new int[n];

		System.out.println("Enter start times:");
		for (int i = 0; i < n; i++) {
			start[i] = sc.nextInt();
		}

		System.out.println("Enter end times:");
		for (int i = 0; i < n; i++) {
			end[i] = sc.nextInt();
		}

		int s = start[0];
		int e = end[0];

		System.out.print("Merged interval : " + s);

		for (int i = 1; i < n; i++) {
			if (start[i] <= e) {
				e = Math.max(e, end[i]);
			} else {
				s = start[i];
				e = end[i];
				System.out.print(" " + s);
			}
		}

		sc.close();
	}
}