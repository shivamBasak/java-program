import java.util.*;
public class string3 {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);

      System.out.println("Enter String");
      String inputStr=sc.nextLine();

        for(char i :inputStr.toCharArray()){
        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
            System.out.println("First non-repeating character is: "+i);
            break;
        }
        }
    }
}