class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        Map<Integer,Integer> h = new HashMap<>();
        for(int n:nums){
            h.put(n,h.getOrDefault(n,0)+1);
        }

        List<Integer> l = new ArrayList<>(h.keySet());
        Collections.sort(l);

        int n = l.size();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int x = l.get(i);
                int y = l.get(j);

                if(!h.get(x).equals(h.get(y))){
                    return new int[]{x,y};
                }
            }
        }
        return new int[]{-1,-1};
    }
}