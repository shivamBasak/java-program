import java.util.*;
public class EXAM1 {

 public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the string");
     String s=sc.nextLine();
     System.out.println("The string"+s);
  permutationWithRepeation(s);

 }

 private static void permutationWithRepeation(String str1) {
  System.out.println("The given string is: PQR");
  System.out.println("The permuted strings are:");
  showPermutation(str1, "");
 }

 private static void showPermutation(String str1, String NewStringToPrint) {

  if (NewStringToPrint.length() == str1.length()) {
   System.out.println(NewStringToPrint);
   return;
  }
  for (int i = 0; i < str1.length(); i++) {

   showPermutation(str1, NewStringToPrint + str1.charAt(i));
  }
 }
}