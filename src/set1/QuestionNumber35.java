package set1;

import java.util.Scanner;

public class QuestionNumber35 {
	  public static  int subarrayPartition(int[] arr, int minLen, long threshold){
 int n =arr.length;
	 int start=0;
	 int  count=0;
	
	 while(start<n) {
		 long sum=0;
		  int length=0;
		  boolean found=false;
		
	 for(int i=start;i<n;i++) {
		 sum+=arr[i];
		
		 length++;
		
		 if(length>=minLen && sum>=threshold) {
			 count++;
			 start=i+1;
			found= true;
			break;
		 }
		
	 }
		 if(!found) break;		  		
	 }
	
	 return count;	
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Size of Array:");
	 int n =sc.nextInt();
	 System.out.println("Enter the Array Element:");
	 int[]arr= new int[n];
	 for(int i=0;i<n;i++) {
		 arr[i]= sc.nextInt();
	 }
	
	 System.out.println("Enter minLen Of SubArray:");
	 int minLen=sc.nextInt();
	 System.out.println("Enter threshold Value:");
	 long threshold= sc.nextInt();
	 int result = subarrayPartition(arr,minLen,threshold);
	 System.out.println("Maximum Number of Valid SubArrays is : "+result);
	
}}