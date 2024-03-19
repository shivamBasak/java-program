class Solution {
    public boolean isHappy(int n) {
         Set<Integer> ch = new HashSet<>();
        while (n != 1 && !ch.contains(n)) {
            ch.add(n);
            int x = 0;
            while (n != 0) {
                x += (n % 10) * (n % 10);
                n /= 10;
            }
            n = x;
        }
        return n == 1;
    }
}