class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb = new StringBuilder();

        int[] l = new int[26];
        Arrays.fill(l,-1);
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int ci = c-'a';

            if(l[ci]!=-1&& sb.length()-l[ci]<=k){
                continue;
            }

            l[ci] = sb.length();
            sb.append(c);
        }
        return sb.toString();
    }
}