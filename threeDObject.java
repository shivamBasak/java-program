
import java.io.*;

abstract class Shape{
 abstract public void surfaceArea();
 abstract public void volume();
 final float pi=3.14f;
}

class Sphere extends Shape{
 double r;
 private double area;
 private double volume;
 public void accept() throws IOException{
  System.out.println("Enter the radius of the Sphere: ");
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  r=Double.parseDouble(br.readLine());
 }
 public void surfaceArea(){
  area=pi*r*r;
 }
 public void volume(){
  
  volume=1.33333333334*pi*r*r*r;
 }
 public void display(){
  surfaceArea();
  volume();
  System.out.println("The area of sphere is: "+area);
  System.out.println("The volume of sphere is: "+volume);
 }
}

class Cone extends Shape{
 double h,r,area,volume;

 public void accept() throws IOException{
  System.out.println("Enter radius and height of the Cone: ");
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  r=Double.parseDouble(br.readLine());
  h=Double.parseDouble(br.readLine());
 }
 public void surfaceArea(){
  
  double sq=h*h+r*r;
  area=pi*r*(r+java.lang.Math.sqrt(sq));
 }
 public void volume(){
  double d=h/3;
  volume=pi*r*r*d;
 }
 public void display(){
  surfaceArea();
  volume();
  System.out.println("The area of Cone is: "+area);
  System.out.println("The volume of Cone is: "+volume);
 }
}

class Cylinder extends Shape{
 double r,h,area,volume;
 public void accept() throws IOException{
  System.out.println("Enter radius and height of the Cylinder: ");
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  r=Double.parseDouble(br.readLine());
  h=Double.parseDouble(br.readLine());
 }
 public void surfaceArea(){
  area=(2*pi*r*h)+(2*pi*r*r);
 }
 public void volume(){
  volume=pi*r*r*h;
 }
 public void display(){
  surfaceArea();
  volume();
  System.out.println("The area of Cylinder is: "+area);
  System.out.println("The volume of Cylinder is: "+volume);
 }
}

class Box extends Shape{
 double l,b,h,area,volume;
 public void accept() throws IOException{
  System.out.println("Enter length, breadth and height of the Box: ");
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  l=Double.parseDouble(br.readLine());
  b=Double.parseDouble(br.readLine());
  h=Double.parseDouble(br.readLine());
 }
 public void surfaceArea(){
  area=(2*l*b)+(2*b*h)+(2*l*h);
 }
 public void volume(){
  volume=l*b*h;
 }
 public void display(){
  surfaceArea();
  volume();
  System.out.println("The area of Box is: "+area);
  System.out.println("The volume of Box is: "+volume);
 }
}

public class threeDObject {
 public static void main(String [] args)throws IOException{
  Sphere s=new Sphere();
  s.accept();
  s.display();
  Cone co=new Cone();
  co.accept();
  co.display();
  Cylinder cy=new Cylinder();
  cy.accept();
  cy.display();
  Box b=new Box();
  b.accept();
  b.display(); 
 }
}