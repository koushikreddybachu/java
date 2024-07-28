import java.util.*;
public class pyramid
{
    public static void main(String a[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("enter the no of rows in pyramid");
            int m=sc.nextInt();
            for (int i = m-1,k=1; i >=0; i--,k++) 
            {
                for(int j=0;j<m;j++)
                {
                    if(i<=j)
                    {
                    System.out.print(k+" ");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
               System.out.println();
            }
        }
    }

}