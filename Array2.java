import java.util.*;
public class Array2 
{
    public static int display(int[] array)
  {
    Arrays.sort(array);
    int n = array[array.length - 1] - array[0];
    int b = array.length;
    if (b == 1) {
      n = array[0];
    }
    return n;
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
    System.out.println("difference between maximum and minimum number");
    int n1 = display(a);
    System.out.println(n1);
  }
  
}