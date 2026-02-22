class Solution {
    public int scoreDifference(int[] nums) {
        int f = 0,s=0;
        boolean fa = true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                fa = !fa;
            }
            if((i+1)%6==0){
                fa = !fa;
            }
            if(fa){
                f +=nums[i];
            }else{
                s += nums[i];
            }
        }
        return f-s;
    }
}