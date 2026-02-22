class Solution {
    public int maxDepth(String s) {
        int lvl  = 0;
        int maxi = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                lvl++;
                maxi = Math.max(maxi,lvl);
            }else if(c == ')'){
                lvl--;
            }
        }
        return maxi;
    }
}