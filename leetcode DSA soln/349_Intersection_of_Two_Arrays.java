class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Set<Integer> r= new HashSet<>();
        for(int num: nums2){
            if(bS(nums1,num)){
                r.add(num);
            }
        }
        int i=0;
        int[] res=new int[r.size()];
        for(int num: r){
            res[i++]=num;
        }
        return res;
    }
    private boolean bS(int[] nums,int t){
        int s=0;
        int e=nums.length -1;
        while(s<=e){
            int m=(s+e)/2;
            if(nums[m]<t){
                s=m+1;
            }
            else if(nums[m]>t)
            e=m-1;
            else
            return true;
        }
        return false;
    }
}