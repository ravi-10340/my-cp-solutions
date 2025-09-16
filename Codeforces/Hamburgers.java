import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String str = s.nextLine();
        long nb = s.nextLong();
        long ns = s.nextLong();
        long nc = s.nextLong();
        long pb = s.nextLong();
        long ps = s.nextLong();
        long pc = s.nextLong();
        long r = s.nextLong();
        
        long br = 0, ss = 0, ch = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'B') br++;
            else if (c == 'S') ss++;
            else if (c == 'C') ch++;
        }

        long low = 0, high = (long) 1e13, ans = 0;
        while (low <= high) {
            long mid = (low + high) / 2;
            
            long needB = Math.max(0, br * mid - nb);
            long needS = Math.max(0, ss * mid - ns);
            long needC = Math.max(0, ch * mid - nc);
            
            long cost = needB * pb + needS * ps + needC * pc;
            
            if (cost <= r) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        System.out.println(ans);
    }
}
