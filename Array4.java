import java.util.*;

class Array4
{

	static int findNumberOfTriangles(int arr[], int n)
	{
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++)
	
					if (arr[i] + arr[j] > arr[k]
						&& arr[i] + arr[k] > arr[j]
						&& arr[k] + arr[j] > arr[i])
						count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args)
	{
        Scanner sc =new Scanner(System.in);
        System.out.println( "Array size ");
        int size =sc.nextInt();
        
        int arr[] = new int[size];
        System.out.println( "Array elements ");
		for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
		System.out.println( "Total number of triangles possible is "+
		findNumberOfTriangles(arr, size));
	}
}


