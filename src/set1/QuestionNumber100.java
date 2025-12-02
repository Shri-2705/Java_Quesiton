package set1;

import java.util.Scanner;

public class QuestionNumber100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();
		System.out.println("Minimum removals: " + getMinRemove(s));
		sc.close();
	}

	static boolean isBalanced(String s) {
		if (s.length() <= 1)
			return true;

		String left = s.substring(1) + s.charAt(0); // left shift
		String right = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1); // right shift

		return left.equals(right);
	}

	static int getMinRemove(String s) {
		if (isBalanced(s))
			return 0;

		int n = s.length(), min = n;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String part = s.substring(i, j);
				if (isBalanced(part)) {
					int remove = n - part.length();
					if (remove < min)
						min = remove;
				}
			}
		}
		return min;
	}
}