class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer>mp =new HashMap<>();
        mp.put(0,-1);
        int s=0,sol=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i]==1?1:-1;
            if(mp.containsKey(s))
            sol=Math.max(sol,i-mp.get(s));
            else
            mp.put(s,i);
        }
        return sol;
    }
}