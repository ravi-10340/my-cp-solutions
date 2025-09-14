import java.util.*;
public class Main{
    public static boolean help(char c){
        char ch = Character.toLowerCase(c);
        return (ch >= 'a' && ch <= 'z');
    }

    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);
        String st = s.nextLine();
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<st.length();i++){
            if(help(st.charAt(i))){
                hs.add(st.charAt(i));
            }
        }
        System.out.println(hs.size());
        s.close();
    }
}
