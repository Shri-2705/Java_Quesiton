package set1;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionNumber18 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer>load=new ArrayList<>();
		System.out.println("Enter Size");
		 int size=sc.nextInt();
		 System.out.println("Enter Number");
		 for(int i=0;i<size;i++) {
			load.add(sc.nextInt());	 
		 }
		ArrayList<Integer>list = new ArrayList<>();
		 int loadArraySize=load.size();
		 int sum=0;
	  for(int m:load) {
			 sum+=m;
	  }
    double average = sum/loadArraySize;
    System.out.println("Average: "+average);
	    for(int i=0;i<load.size();i++) {
	    	if(load.get(i)>average) {
	    		list.add(i);
	    	}
	    }
	       System.out.println("Result: "+list);
}}