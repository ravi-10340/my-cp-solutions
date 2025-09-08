import java.util.*;
public class A_Magnets{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine();
        String[] s = new String[t];
        for(int i=0;i<t;i++){
            s[i]  =sc.nextLine();
        }
        int g = 1;
        for (int i = 1; i < t; i++) {
            if(!s[i].equals(s[i - 1])){
                g++;
            }
        }
        System.out.println(g);
 
    }
}
