import java.util.*;
public class Main{
    public static boolean isvowel(char ch){
        char c = Character.toLowerCase(ch);
        if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='y'){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                continue;
            }else{
                res.append(".");
                char c = s.charAt(i);
                res.append(Character.toLowerCase(c));
            }
        }
        System.out.println(res);
        sc.close();
        
    }
}
