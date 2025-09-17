import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] home = new int[n];
        int[] guest = new int[n];
        
        for (int i = 0; i < n; i++) {
            home[i] = sc.nextInt();
            guest[i] = sc.nextInt();
        }
        
        int count = 0;
        // For each pair (host, guest)
        for (int i = 0; i < n; i++) {       // host
            for (int j = 0; j < n; j++) {   // guest
                if (i != j && home[i] == guest[j]) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
