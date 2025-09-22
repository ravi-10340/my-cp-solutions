import java.util.*;

public class Solution {
    static final int MOD = 1_000_000_007;
    static final int MAXN = 200_000; // 2 * 10^5
    static long[] factDiv2 = new long[MAXN + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        factDiv2[0] = 1;
        factDiv2[1] = 1;
        for (int i = 2; i <= MAXN; i++) {
            if (i == 2) {
                factDiv2[i] = 1; 
            } else {
                factDiv2[i] = (factDiv2[i - 1] * i) % MOD;
            }
        }

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(factDiv2[2 * n]);
        }
    }
}
