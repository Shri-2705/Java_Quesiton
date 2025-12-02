package set1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QuestionNumber05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of users");
		int n=sc.nextInt();
		
		int users[]=new int[n];
		System.out.println("Enter the user IDs");
		for(int i=0;i<n;i++) {
			users[i]=sc.nextInt();
		}
		
		int timestamp[]=new int[n];
		System.out.println("Enter the timestamp ");
		for(int i=0;i<n;i++) {
			timestamp[i]=sc.nextInt();
		}
		
		System.out.println("Enter the limit");
		int k=sc.nextInt();
		
		int result[]=new int[n];
		HashMap<Integer,Queue<Integer>> map=new HashMap<>();
		
		 for(int i=0;i<n;i++) {
			 int user=users[i];
			 int time=timestamp[i];
			
			 map.putIfAbsent(user, new LinkedList<Integer>());
			 Queue<Integer> temp=map.get(user);
			 while(!temp.isEmpty() && temp.peek()<=(time-60))temp.poll();
			
			 if(temp.size()<k) {
				 temp.add(time);
				 result[i]=1;
			 }
			 else result[i]=0;
			
			 map.put(user, temp);
		 }
		
		for(int i=0;i<n;i++)System.out.print(result[i]+" ");
	}}
