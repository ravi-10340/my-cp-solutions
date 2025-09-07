class Solution {
    public boolean reorderedPowerOf2(int n) {
        if(n==1){
            return true;
        }
        int[] f1 = new int[10];
        int r = 0;
        while(n>0){
            r = n%10;
            f1[r]++;
            n= n/10;
        }
        int s=0;
        for(int i=1;i<31;i++){
            int a = (int)Math.pow(2, i);
            int[] f2 = new int[10];
            while(a>0){
                s = a%10;
                f2[s]++;
                a = a/10;
            }
            if(Arrays.equals(f1,f2)){
                return true;
            }
        }
        return false;
    }
}
