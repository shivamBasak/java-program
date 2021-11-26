class inheritance{  
    float salary=30;  
   }  
   class Programmer extends inheritance{  
    int bonus=90;  
    public static void main(String args[]){  
      Programmer p=new Programmer();  
      System.out.println("Programmer salary is:"+p.salary);  
      System.out.println("Bonus of Programmer is:"+p.bonus);  
   }  
   }  