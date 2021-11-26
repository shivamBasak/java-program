import java.util.*;
public class string6 {
    public static void removeSetofCharacters(String str, String ptn1, String ptn2) {
        int n = str.length(), i;
        int ptr = 0;
        char[] arr1 = str.toCharArray();
        for (i = 0; i < n; ++i) {
         if (arr1[i] == 'b') {
          continue;
         } else if (i + 1 < n && arr1[i] == 'a' && arr1[i + 1] == 'c') {
          ++i;
         } else {
          arr1[ptr++] = arr1[i]; // Copy char to head.
         }
        }
        char[] ret = Arrays.copyOfRange(arr1, 0, ptr);
        System.out.println(new String(ret));
       }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String strg = sc.nextLine();
  System.out.println("The given string is: " + strg);
  System.out.print("After removing the new string is: ");
  removeSetofCharacters(strg, "ac", "b");
 }
 
}