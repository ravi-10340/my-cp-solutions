class Solution {
    public String removeStars(String s) {
        Stack<String> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c != '*'){
                st.push(String.valueOf(c));
            }
            else{
                st.pop();
            }
        }
        String s1 ="";
        while(!st.empty()){
            s1+=st.peek();
            st.pop();
        }
        String reversed = new StringBuilder(s1).reverse().toString();

        return reversed;
    }
}
