import java.util.*;
public class invertedNumberpyramid
{
    public static void main(String a[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter no of rows");
            int m=sc.nextInt();
            System.out.println("Enter no of coloumns");
            int n=sc.nextInt();
            for(int i=0;i<m;i++)
            {
                int k=1;
                for(int j=0;j<n;j++)
                {
                    if(j<=i)
                    System.out.print(" ");
                    else
                    {
                    System.out.print(k);
                    k++;
                    }
                }
                System.out.println();
            }
        }
    }
}