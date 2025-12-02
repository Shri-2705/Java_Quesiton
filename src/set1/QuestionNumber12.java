package set1;

import java.util.Scanner;

public class QuestionNumber12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of stock price");

	int[] arr=new int[5];
	for (int i = 0; i < 5; i++) {
		arr[i]=sc.nextInt();
	}
int buy=arr[0];
int profit=0;
for (int i = 1; i < arr.length; i++) {
	profit=Math.max(profit, arr[i]-buy);
	if(arr[i]<buy) {
		buy=arr[i];
	}
}
System.out.println("Profit is " + profit);
	}

}
//int arr[]= {2,4,6,8,10};