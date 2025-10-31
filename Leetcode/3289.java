class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i],h.get(nums[i])+1);
            }else{
                h.put(nums[i],1);
            }
        }
        int[] a = new int[2];
        int c=0;
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            if(e.getValue()>1){
                a[c++] = e.getKey();
            }
        }
        return a;
    }
}
