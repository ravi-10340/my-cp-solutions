class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n==1){
            arr[0] = 0;
            return arr;
        }
        if(n%2==0){
            for(int i=0,j=1;i<n;i+=2,j++){
                arr[i] = j;
                arr[i+1] = -j;
            }
        }
        else{
            arr[0] = 0;
            for(int i=1,j=1;i<n;i+=2,j++){
                arr[i] = j;
                arr[i+1] = -j;
            }
        }
        Arrays.sort(arr);   
        return arr;
    }
}
