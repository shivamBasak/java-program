class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sol=0;
        int p=0;
        Map<Integer,Integer> count= new HashMap<>();
        count.put(0,1);
        for(int n:nums){
            p+=n;
            int k=p-goal;
            if(count.containsKey(k))
            sol +=count.get(k);
            count.merge(p,1,Integer::sum);
        }
        return sol;
    }
}