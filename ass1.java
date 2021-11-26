import java.util.*;
public class ass1
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	    System.out.println("Enter a number");
	    int k=sc.nextInt();
	    int j=k,p,s=0;
	    while(j!=0)
	    {   p=j%10;
	        s=p+s*10;
	        j=j/10;
	    }
	if(s==k)
	System.out.println("palindrome");
	else
	System.out.println("not palindrome");
	    
	}
	}
