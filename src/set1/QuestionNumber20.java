package set1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionNumber20 {
	// TODO Auto-generated method stub
	public static int getExecutionTime(List<Integer> start, List<Integer> end) {
        int n = start.size();
        List<int[]> intervals = new ArrayList<>();

        // Step 1: Combine start and end into interval pairs
        for (int i = 0; i < n; i++) {
            intervals.add(new int[]{start.get(i), end.get(i)});
        }

        // Step 2: Sort intervals by start time
        intervals.sort((a, b) -> Integer.compare(a[0], b[0]));

        // Step 3: Merge intervals and calculate total time
        int totalTime = 0;
        int mergedStart = intervals.get(0)[0];
        int mergedEnd = intervals.get(0)[1];

        for (int i = 1; i < n; i++) {
            int currStart = intervals.get(i)[0];
            int currEnd = intervals.get(i)[1];

            if (currStart <= mergedEnd) {
                mergedEnd = Math.max(mergedEnd, currEnd);
            } else {
                totalTime += (mergedEnd - mergedStart + 1);
                mergedStart = currStart;
                mergedEnd = currEnd;
            }
        }

        totalTime += (mergedEnd - mergedStart + 1);
        return totalTime;
    }

    public static void main(String[] args) {
        List<Integer> start = Arrays.asList(1, 2, 8);
        List<Integer> end = Arrays.asList(5, 6, 10);

        int result = getExecutionTime(start, end);
        System.out.println("Total Execution Time: " + result);
    }
}
