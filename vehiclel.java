import java.util.*;

abstract class Vehicle
{
   abstract public void SHOWDATA();
   


}
class Car extends Vehicle{

 String manufacturer;

public void SHOWDATA(){
    
 int regnNumber;
 int speed;
 String Colour;
 String ownerName;

   Scanner sc=new Scanner(System.in);

System.out.println("Enter the car's details:\nregion no.:");
   regnNumber=sc.nextInt();

System.out.println("Speed of Car(Km/hr):");
   speed=sc.nextInt();

System.out.println("colour");
   Colour=sc.nextLine();

System.out.println("Owner name");
   ownerName=sc.nextLine();

   System.out.println("Manufacturer name");
   manufacturer=sc.nextLine();
  System.out.println("OWNER name "+ownerName);
  System.out.println("colour "+Colour);
  System.out.println("speed of car "+speed);
  System.out.println("REGION NUMBER "+regnNumber);
  System.out.println("Manufacturer name "+manufacturer);
}



}

class Truck extends Vehicle
{
   
   int regnNumber;
   int speed;
   String Colour;
   String ownerName;

 int routeNumber;
 public void SHOWDATA(){

    Scanner sc=new Scanner(System.in);
 
 System.out.println("Enter the TRUCK's details:\nregion no.:");
 
    regnNumber=sc.nextInt();
 
 System.out.println("Speed of truck(Km/hr):");
 
    speed=sc.nextInt();
 
 System.out.println("colour");
 
    Colour=sc.nextLine();
 
 System.out.println("Owner name");
 
    ownerName=sc.nextLine();
    System.out.println("ROUTE NUMBER");
    routeNumber=sc.nextInt();

    System.out.println("OWNER name "+ownerName);
    System.out.println("colour "+Colour);
    System.out.println("speed of TRUCK "+speed);
    System.out.println("REGION NUMBER "+regnNumber);
    System.out.println("ROUTE NO. "+routeNumber);
 }
 
}
public class vehiclel
{

public static void main(String [] args)
{

Car ob1= new Car();

Truck ob2=new Truck();

ob1.SHOWDATA();

ob2.SHOWDATA();


}
}