import java.util.*;
public class Array3
{
    public static int longest_sequence(int[] array) {
        if (array.length == 0)
            return 0;
    
        int length = 1;
        int ans = 1;
        
        Arrays.sort(array);
        
        for (int i = 0; i < array.length - 1; i++)
        {
            if(array[i] == array[i+1]) {
                continue;
            }
            else if (array[i] + 1 == array[i + 1])
            {
                length++;
            }
            else
            {
                length = 1;
            }
            
            ans = Math.max(ans,length);
        }
    
        
        return ans;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter size");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter element");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("consecutive");
    int n1 = longest_sequence(a);
    System.out.println(n1);
  }
  
}