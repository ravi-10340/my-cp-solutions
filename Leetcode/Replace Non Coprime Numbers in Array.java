class Solution {
    public int gcd(int a,int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        return gcd(b, a % b);
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int top;
        for(int num:nums){
            int cur = num;
            while(!s.empty() && gcd(s.peek(),cur)>1){
                top = s.pop();
                cur = (top / gcd(top,cur)) * cur;

            }
            s.push(cur);
        }
        return s;

    }
}
