import java.util.*;

class arr2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a,b;

        
        System.out.println("Enter number of array elements : ");
        int size = sc.nextInt();

        b=size-1;
        int arr[] = new int[size];
        int arr2[] = new int[b];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        
        System.out.println("You have entered : ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        int j=0;
        System.out.println(arr[arr.length - 1]);
        System.out.println(" Entered the position to be deleted in array : ");
        int num= sc.nextInt();
        for (int i = 0; i < size ; i++) {
            
            if(i!=(num-1))
            {
            arr2[j]=arr[i];
                j=j+1;
        }
        }       
        for (int i = 0; i < b; i++) {
            if(i<(b-1))
            System.out.print(arr2[i] + ",");
        else
        System.out.print(arr2[i] );
        }
        
    }
}
