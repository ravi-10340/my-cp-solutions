class Solution {
    public int beauty(String s){
        int[] a = new int[26];
        for(int i=0;i<26;i++){
            a[i] = 0;
        }
        for(int i=0;i<s.length();i++){
            int k = s.charAt(i)-'a';
            a[k]++;
        }
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            if(a[i]>maxi){
                maxi = a[i];
            }
            if(a[i] > 0 && a[i]<mini){
                mini = a[i];
            }
        }
        return maxi-mini;
    }
    public int beautySum(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                ans += beauty(s.substring(i,j+1));
            }
        }
        return ans;
    }
}