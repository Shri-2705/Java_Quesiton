package set1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionNumber02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int start[] = new int[n];
		System.out.println("Enter the start time array element");
		for (int i = 0; i < n; i++) {
			start[i] = sc.nextInt();
		}
		int end[] = new int[n];
		System.out.println("Enter the end time array element");
		for (int i = 0; i < n; i++) {
			end[i] = sc.nextInt();
		}
		System.out.println("Enter the interval");
		int t = sc.nextInt();

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		ArrayList<Integer> neu = new ArrayList<>();
		neu.add(start[0]);
		neu.add(end[0]);
		list.add(neu);
		for (int i = 1; i < n; i++) {
			if ((start[i] <= list.get(list.size() - 1).get(1)) || ((start[i] - 1) == list.get(list.size() - 1).get(1)))
				list.get(list.size() - 1).set(1, end[i]);
			else {

				ArrayList<Integer> temp = new ArrayList<>();
				temp.add(start[i]);
				temp.add(end[i]);
				list.add(temp);
			}
		}
		int count = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			count += (list.get(i + 1).get(0) - list.get(i).get(1) - 1);
		}

		count += (t - list.get(list.size() - 1).get(1));
		System.out.println(count);
	}
}