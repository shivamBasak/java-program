class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> r= new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int l=Math.abs(nums[i])-1;
            if(nums[l]>0)
            nums[l]=-nums[l];
            else
            r.add(l+1);
        }
        return r;
    }
}