import java.util.*;

class arr1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a;

        
        System.out.println("Enter number of array elements : ");
        int size = sc.nextInt();

        
        int arr[] = new int[size];

        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        
        System.out.println("You have entered : ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1]);

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

        
            if (arr[i] > arr[j]) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }

        
        System.out.println("Final array after the sorting : ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1]);

    }
}
