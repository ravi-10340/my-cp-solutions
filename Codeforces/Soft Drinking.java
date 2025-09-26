import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long l = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long p = sc.nextLong();
        long nl = sc.nextLong();
        long np = sc.nextLong();
        long drink = k * l;
        long byDrink = drink / nl;
        long byLime = c * d;
        long bySalt = p / np;
        long ans = Math.min(byDrink, Math.min(byLime, bySalt)) / n;
        System.out.println(ans);
    }
}
