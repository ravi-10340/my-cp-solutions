class Solution {
    public boolean isvowel(char ch){
        char c = Character.toLowerCase(ch);
        if(c == 'a' || c == 'e'||c == 'i'||c == 'o'||c == 'u'){
            return true;
        }
        return false;
    }
    public boolean doesAliceWin(String s) {
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                cnt++;
            }
        }
        if(cnt == 0){
            return false;
        }else{
            return true;
        }
    }
}
