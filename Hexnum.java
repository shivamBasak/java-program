 
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
class HexNum extends Num{ 
    Scanner obj=new Scanner(System.in);
     int n; 
    public static void main(String[] args)
     {
          Num n1=new Num();
           n1.shownum();
            HexNum hn=new HexNum();
             hn.n=n1.num;
              hn.shownum(); 
            } 
void shownum()
{
     int rem; String str="";
 char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
while(n>0) {
     rem=n%16; 
     str=hex[rem]+str;
      n=n/16;
     }
 System.out.println("hexadecimal: "+str); 
} 
}