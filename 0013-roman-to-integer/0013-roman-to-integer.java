class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> h = new HashMap<>();
        String st = "IVXLCDM";
        int l = 1;
        for(int i=0;i<st.length();i++){
            char c = st.charAt(i);
            h.put(c,l);
            if(i%2==1){
                l = l*2;
            }
            else{
                l = l*5;
            }
        }
        int ans = 0;
        int i=0;
        while(i<s.length()-1){
            char c = s.charAt(i);
            int j = i+1;
            char d = s.charAt(j);
            int a = h.get(c);
            int b = h.get(d);
            if(a<b){
                int o = b-a;
                ans += o;
                i+=2;
            }else{
                ans += a;
                i++;
            }
        }
        if(i == s.length()-1){
            ans += h.get(s.charAt(i));
        }
        return ans;
    }
}