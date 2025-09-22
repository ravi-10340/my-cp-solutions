class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        int max = Collections.max(mp.values());
        int cnt=0;
        for(int val : mp.values()){
            if(val == max){
                cnt += val;
            }
        }
        return cnt;
    }
}
