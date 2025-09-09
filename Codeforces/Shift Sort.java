import java.util.Scanner;
 
public class A_Shift_Sort {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int tr = sr.nextInt();
        for(int i=0;i<tr;i++){
            int nr = sr.nextInt();
            sr.nextLine();
            String srt = sr.nextLine();
            int s = 0;
            int e = nr-1;
            int cnt =0 ;
            while(s<e){
                if(srt.charAt(s) == '1' && srt.charAt(e) == '0') {
                    cnt++;
                    s++;
                    e--;
                }else{
                    if (srt.charAt(s) != '1') s++;
                    if (srt.charAt(e) != '0') e--;
                }
            }
            System.out.println(cnt);
        }
        sr.close();
    }
}
