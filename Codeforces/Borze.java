import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        StringBuilder res = new StringBuilder();
 
        for (int i = 0; i < st.length(); ) {
            char ch = st.charAt(i);
            if (ch == '-') {
                char ch2 = st.charAt(i + 1);
                if (ch2 == '.') {
                    res.append('1');
                } else {
                    res.append('2');
                }
                i += 2;
            } else {
                res.append('0');
                i++;
            }
        }
 
        System.out.println(res.toString());
        s.close();
    }
}
