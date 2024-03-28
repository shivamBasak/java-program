class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int s=0;
        Map<Integer,Integer> count =new HashMap<>();
        for(int i=0,r=0;r<nums.length;r++){
            count.merge(nums[r],1,Integer::sum);
            while(count.get(nums[r])==k+1)
            count.merge(nums[i++],-1,Integer::sum);
            s=Math.max(s,r-i+1);
        }
    return s;
    }
}