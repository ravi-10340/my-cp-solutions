import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- >0){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int res = a^b^c;
            System.out.println(res);
        }
        s.close();
    }
}
