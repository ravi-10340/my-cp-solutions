class Solution {
    public String maximumXor(String s, String t) {
        int z =0 , o =0;
        for(char c:t.toCharArray()){
            if(c=='0') z++;
            else o++;
        }
        StringBuilder sb  = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i);
            if(sc =='0' && o >0){
                sb.append('1');
                o--;
            }else if(sc=='1' && z>0){
                sb.append('1');
                z--;
            }else{
                sb.append('0');
                if(sc=='0') z--;
                else o--;
            }
        }
        return sb.toString();
    }
}