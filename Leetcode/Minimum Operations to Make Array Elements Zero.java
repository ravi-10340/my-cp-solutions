import java.util.*;

class Solution {
    static class Range {
        long start, end;
        int steps;
        Range(long s, long e, int st) {
            start = s; end = e; steps = st;
        }
    }

    List<Range> ranges = new ArrayList<>();

    public Solution() {
        long start = 1;
        int steps = 1;
        while (start <= 1e9) {
            long end = Math.min((long)1e9, (long)Math.pow(4, steps) - 1);
            ranges.add(new Range(start, end, steps));
            start = end + 1;
            steps++;
        }
    }

    private long sumSteps(long x) {
        if (x <= 0) return 0;
        long total = 0;
        for (Range r : ranges) {
            if (r.end <= x) {
                total += (r.end - r.start + 1) * (long)r.steps;
            } else if (r.start <= x) {
                total += (x - r.start + 1) * (long)r.steps;
                break;
            } else break;
        }
        return total;
    }

    public long minOperations(int[][] queries) {
        long ans = 0;
        for (int[] q : queries) {
            long l = q[0], r = q[1];
            long totalSteps = sumSteps(r) - sumSteps(l - 1);
            ans += (totalSteps + 1) / 2; // ceil division
        }
        return ans;
    }
}
