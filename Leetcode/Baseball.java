class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String s:operations){
            if(s.equals("C")){
                st.pop();
            }else if(s.equals("D")){
                int t = 2 * st.peek();
                st.push(t);
            }else if(s.equals("+")){
                int t1 = st.pop();
                int t2 = st.peek();
                st.push(t1);
                st.push(t1 + t2);
            }
            else{
                int y = Integer.parseInt(s);
                st.push(y);
            }
        }
        int sumi=0;
        for(int i:st){
            sumi += i;
        }
        return sumi;
    }
}
