 import java.util.Scanner;
class Num{ 
    int num; 
    Scanner obj=new Scanner(System.in);
     void shownum()
     { 
         System.out.print("enter a number");
          num=obj.nextInt();
           System.out.println("number entered by you is "+num);
        } 
       }; 
class octnum extends Num{ 
   Scanner obj=new Scanner(System.in);
    int n; 
   public static void main(String[] args)
    {
         Num n1=new Num();
          n1.shownum();
           octnum hn=new octnum();
            hn.n=n1.num;
             hn.shownum(); 
           } 
void shownum()
{
    int rem; 
    String octal="";   
     
    char octalchars[]={'0','1','2','3','4','5','6','7'};  
      
    while(n>0)  
    {  
       rem=n%8;   
       octal=octalchars[rem]+octal;   
       n=n/8;  
    }  
System.out.println("octan: "+octal); 
} 
}