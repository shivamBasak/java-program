    import java.util.*;   
      
   
    class String2   
    {   
       
        void FirstNonRepeatedCharFirst(String inputstr)
  {
      char j;
     for(int i=0;i<(inputstr.length()-1;i++)
     {
        j=charAt(i);
        for(int k=1;k<=inputstr.length();k++)
        {
            if(j!=inputstr.charAt(k))
            {
                System.out.println(inputstr.charAt(j));
            break;
            }
            }

     }
    }
}

        public static void main(String[] args)   
        {   
            Scanner sc=new Scanner(System.in);
           System.out.println("Enter String");
           String st=sc.nextLine(); 
           FirstNonRepeatedCharFirst(st);
        }   
    }  

