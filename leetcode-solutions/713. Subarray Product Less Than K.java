class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int r=0,s=0,p=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=k){
                s=i+1;
                p=1;
            }
            else{
                p*=nums[i];
                while(p>=k){
                    p/=nums[s];
                    s++;
                }
                r+=i-s+1;
            }
        }
        return r;
    }
}