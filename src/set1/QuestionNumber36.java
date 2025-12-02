package set1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class QuestionNumber36 {

	 public static List<String> getMinBalanceMembers(String[][] transactions) {
		 
	        Map<String, Integer> balance = new HashMap<>();
	 
	        // Step 1: calculate net balance
	        for (String[] t : transactions) {
	            String sender = t[0];
	            String receiver = t[1];
	            int amount = Integer.parseInt(t[2]);
	 
	            balance.put(sender, balance.getOrDefault(sender, 0) - amount);
	            balance.put(receiver, balance.getOrDefault(receiver, 0) + amount);
	        }
	 
	        // Step 2: find minimum balance
	        int minBalance = Integer.MAX_VALUE;
	        for (int v : balance.values()) {
	            if (v < minBalance) minBalance = v;
	        }
	 
	        // Step 3: if no negative
	        if (minBalance >= 0) {
	            System.out.println("Nobody has a negative balance");
	            return Arrays.asList("Nobody has a negative balance");
	        }
	 
	        // Step 4: collect names having minimum balance
	        List<String> result = new ArrayList<>();
	        for (String name : balance.keySet()) {
	            if (balance.get(name) == minBalance) {
	                result.add(name);
	            }
	        }
	 
	        Collections.sort(result);
	 
	        // ✅ PRINT NAME + NEGATIVE VALUE
	        for (String name : result) {
	            System.out.println(name + " " + balance.get(name));
	        }
	 
	        return result;
	    }
	 
	    public static void main(String[] args) {
	 
	        String[][] transactions = {
	            {"Alex", "Blake", "2"},
	            {"Blake", "Alex", "2"},
	            {"Casey", "Alex", "5"},
	            {"Blake", "Casey", "7"},
	            {"Alex", "Blake", "4"},
	            {"Alex", "Casey", "4"}
	        };
	 
	        getMinBalanceMembers(transactions);
	    }
	}