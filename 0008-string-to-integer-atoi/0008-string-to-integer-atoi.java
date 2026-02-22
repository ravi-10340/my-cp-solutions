class Solution {
    public int myAtoi(String s) {
        long ans = 0;
        int i= 0;
        int n = s.length();
        int sign = 1;
        while(i<n && s.charAt(i) == ' ') i++;

        if(i<n && ( s.charAt(i) == '-' || s.charAt(i) == '+')){
            if(s.charAt(i) == '-') sign = -1;
            i++;
        }
        
        while(i< n && (s.charAt(i) >= '0' && s.charAt(i)<= '9')){
            int k = s.charAt(i) - '0';
            ans = ans*10 + k;

            if(sign*ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign*ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }
        return sign*(int)ans;
    }
}