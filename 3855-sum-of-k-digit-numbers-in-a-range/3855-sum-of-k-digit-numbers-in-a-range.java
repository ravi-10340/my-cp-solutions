class Solution {
    static final long MOD = 1_000_000_007;
    public int sumOfNumbers(int l, int r, int k) {
        long n = r-l+1;

        long sd = n*(l+r)/2;
        sd %= MOD;

        long pn = modPow(n,k-1);

        long tp = modPow(10,k);
        long on = (tp - 1 + MOD )%MOD;
        long inv = modPow(9,MOD-2);

        on = (on*inv)%MOD;

        long ans = sd;
        ans = (ans*pn )%MOD;
        ans = (ans*on)%MOD;

        return (int)ans;
    }
    private long modPow(long b,long e){
        long res = 1;
        b %= MOD;

        while(e>0){
            if((e&1)==1){
                res = (res*b)%MOD;
            }
            b = (b*b)%MOD;
            e >>=1 ;
        }
        return res;
    }
}