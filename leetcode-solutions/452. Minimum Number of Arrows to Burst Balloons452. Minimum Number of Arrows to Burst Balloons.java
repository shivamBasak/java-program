class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points==null||points.length==0){
            return 0;
        }
        int l=points.length;
        int m=0;
        Arrays.sort(points,(p1,p2)->Integer.compare(p1[1],p2[1]));
        long c=Long.MIN_VALUE;
        for(int []point : points){
            int Ns=point[0];
            int nE=point[1];
            if(Ns>c){
                c=nE;
                m++;
            }
        }
        return m;
    }
}