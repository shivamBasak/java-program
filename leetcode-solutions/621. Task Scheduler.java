class Solution {
    public int leastInterval(char[] tasks, int n) {
        int [] tc=new int[26];
        
        for(char task : tasks){
          ++tc[task-'A'];
        }
        int f=Arrays.stream(tc).max().getAsInt();
        int ft=(f-1)*(n+1);
       int nf=(int)Arrays.stream(tc).filter(c->c==f).count();
        return Math.max(ft+nf,tasks.length);
    }
}