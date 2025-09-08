class Solution {
    public boolean checker(int z){
        int r;
        while(z>0){
            r = z%10;
            if(r == 0){
                return false;
            }
            z=z/10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];
        for(int i=1;i<n;i++){
            int y = n-i;
            boolean b1 = checker(y);
            boolean b2 = checker(i);
            if( b1 && b2){
                arr[0] = y;
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
}
