import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        // int[] ar = new int[t];
        int fr=0,un =0;
        for(int i=0;i<t;i++){
            int x = s.nextInt();
            if(x>0){
                fr += x;
            }else{
                if(fr>0){
                    fr--;
                }else{
                    un++;
                }
            }
        }
        System.out.println(un);
        s.close();
    }
}
