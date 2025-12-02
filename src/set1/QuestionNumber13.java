package set1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuestionNumber13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time limit");
		int time=sc.nextInt();
		
		System.out.println("Enter the number of users");
		int n=sc.nextInt();
		
		System.out.println("Enter the users IDs");
		String users[]=new String[n];
		for(int i=0;i<n;i++)users[i]=sc.next();
		
		System.out.println("Enter the timestamp of users");
		int timestamp[]=new int[n];
		
		for(int i=0;i<n;i++)timestamp[i]=sc.nextInt();
		
		int count=0;
		 HashMap<String,ArrayList<Integer>> map=new HashMap<>();
		
		 for(int i=0;i<n;i++) {
			 map.putIfAbsent(users[i], new ArrayList<>());
			 map.get(users[i]).add(timestamp[i]);
		 }
		
		 for(String s:map.keySet()) {
			
			 ArrayList<Integer> temp=map.get(s);
			
			 for(int i=0;i<temp.size()-1;i++) {
				 if((temp.get(i+1)-temp.get(i))<=time)count++;
			 }
		 }
		 System.out.println(count);
	}
 
}