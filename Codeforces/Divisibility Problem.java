mport java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner z = new Scanner(System.in);
        int t = z.nextInt();
        while(t-- > 0){
            long a = z.nextLong();
            long b = z.nextLong();
            
            long remainder = a % b;
            if(remainder == 0){
                System.out.println(0);
            } else {
                System.out.println(b - remainder);
            }
        }
    }
}
