class Solution {
    public int divide(int dividend, int divisor) {
         if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
            return Integer.MAX_VALUE;
        }
       
        int s = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0) ? -1 : 1;
        int q = 0;
        long aDd = Math.abs((long) dividend);
        long aDr = Math.abs((long) divisor);
      
        while (aDd >= aDr) {
       
            int shift = 0;
            while (aDd >= (aDr << shift)) {
                shift++;
            }
             q += (1 << (shift - 1));
            aDd -= aDr << (shift - 1);
        }
        return s == -1 ? -q : q;

    }
}