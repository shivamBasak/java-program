import java.util.*;
public class Arra6   
{    
    public static void main(String[] args) {    
        
        Scanner sc=new Scanner(System.in);
        int row1, col1, row2, col2;    

        int a[][] = new int[3][3];
           
          int b[][] = new int[3][3];

       row1 = 3;    
        col1 = 3;    
        System.out.println("Variable of a matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Variable of b matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }

        row2 =3;    
        col2 = 3;    
        if(col1 != row2){    
            System.out.println("Matrices cannot be multiplied");    
        }    
        else{    
            int prod[][] = new int[row1][col2];    
                
            for(int i = 0; i < row1; i++){    
                for(int j = 0; j < col2; j++){    
                    for(int k = 0; k < row2; k++){    
                       prod[i][j] = prod[i][j] + a[i][k] * b[k][j];     
                    }    
                }    
            }    
                
            System.out.println("Product of two matrices: ");    
            for(int i = 0; i < row1; i++){    
                for(int j = 0; j < col2; j++){    
                   System.out.print(prod[i][j] + " ");    
                }    
                System.out.println();    
            }    
        }    
    }    
}    