import java.math.BigInteger;
class Solution {
    BigInteger one = BigInteger.ONE;
    BigInteger two = BigInteger.valueOf(2);
    public int numSteps(String s) {
        BigInteger n = new BigInteger(s, 2);        
        int cnt = 0;
        while(!n.equals(one)) {
            if(n.mod(two).equals(BigInteger.ZERO)) {
                n = n.divide(two);
            } else {
                n = n.add(one);
            }
            cnt++;
        }
        return cnt;
    }
}