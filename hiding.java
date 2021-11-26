
class hiding
{  
public static void method1()  
{  
System.out.println("Method-1 of the Demo class is executed.");  
}  
public void method2()  
{  
System.out.println("Method-2 of the Demo class is executed.");  
}  
}  
//child class  
public class Sample extends hiding  
{  
public static void method1()  
{  
System.out.println("Method-1 of the Sample class is executed.");  
}  
public void method2()  
{  
System.out.println("Method-2 of the Sample class is executed.");  
}  
public static void main(String args[])  
{  
hiding d1 = new hiding();  
  
hiding d2 = new Sample();  
 
d1.method1();  
d2.method1();  

d1.method2();  
d2.method2();  
}  
} 