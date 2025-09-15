import java.util.*;

public class Main {
    public static int minOps(String s) {
        int n = s.length();

        int allZero = 0;
        for (char c : s.toCharArray())
            if (c == '1') allZero++;

        int allOne = 0;
        for (char c : s.toCharArray())
            if (c == '0') allOne++;

        int[] prefixOnes = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixOnes[i] = prefixOnes[i - 1] + (s.charAt(i - 1) == '1' ? 1 : 0);
        }
        int totalOnes = prefixOnes[n];

        int minCase3 = n;
        for (int i = 0; i <= n; i++) {
            int leftFlips = prefixOnes[i];
            int rightZeros = (n - i) - (totalOnes - prefixOnes[i]);
            minCase3 = Math.min(minCase3, leftFlips + rightZeros);
        }

        int minCase4 = n;
        for (int i = 0; i <= n; i++) {
            int leftZeros = i - prefixOnes[i];
            int rightOnes = totalOnes - prefixOnes[i];
            minCase4 = Math.min(minCase4, leftZeros + rightOnes);
        }

        return Math.min(Math.min(allZero, allOne), Math.min(minCase3, minCase4));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(minOps(s));
        }
        sc.close();
    }
}
