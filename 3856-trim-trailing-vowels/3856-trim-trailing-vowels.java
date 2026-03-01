class Solution {
    public String trimTrailingVowels(String s) {
        int e = s.length()-1;
        while(e>=0 && isvowel(s.charAt(e))) e--;

        return s.substring(0,e+1);
    }
    public boolean isvowel(char c){
        return c=='a'|| c=='e' || c=='i' || c=='o' || c=='u';
    }
}