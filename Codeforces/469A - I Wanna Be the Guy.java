import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();   // total levels
        int p = s.nextInt();   // number of levels player 1 can pass
        Set<Integer> levels = new HashSet<>();
 
        for (int i = 0; i < p; i++) {
            levels.add(s.nextInt());
        }
 
        int q = s.nextInt();   // number of levels player 2 can pass
        for (int i = 0; i < q; i++) {
            levels.add(s.nextInt());
        }
 
        if (levels.size() == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
