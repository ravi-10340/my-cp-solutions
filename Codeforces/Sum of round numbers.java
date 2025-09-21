import java.util.*;

public class RoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> parts = new ArrayList<>();
            int place = 1;
            int temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit != 0) {
                    parts.add(digit * place);
                }
                temp /= 10;
                place *= 10;
            }
            System.out.println(parts.size());
            for (int i = 0; i < parts.size(); i++) {
                System.out.print(parts.get(i) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
