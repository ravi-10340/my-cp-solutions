import java.util.*;
 
public class Main {
    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine(); 
 
        int sumi = 0;
        for (int i = 0; i < n; i++) {
            String st = s.nextLine().trim();
            if (st.isEmpty()) {
                i--; 
                continue;
            }
            char ch = st.charAt(0);
 
            if (ch == 'T') {
                sumi += 4;
            } else if (ch == 'C') {
                sumi += 6;
            } else if (ch == 'I') {
                sumi += 20;
            } else if (ch == 'D') {
                sumi += 12;
            } else {
                sumi += 8;
            }
        }
        System.out.println(sumi);
        s.close();
    }
}
