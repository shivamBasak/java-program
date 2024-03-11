class Solution {
    public String customSortString(String order, String s) {
         char[] c=order.toCharArray();
        char[] a=s.toCharArray();
        char[] b= new char[a.length];
        int[] f=new int[26];
        for(char cu : a){
            ++f[cu-'a'];
        }
        int d=0;
        for(int i=0;i<c.length;i++){
            char cc=c[i];
            while(f[cc-'a']--> 0){
                b[d++]=cc;

            }
        }
        for(int i=0;i<26;i++){
        while(f[i]-->0){
            b[d++]=(char)(i+'a');
        }
        }
        return new String(b);

    }
}