import java.util.*;
public class halfPyramid
{
    public static void main(String a[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter no of rows in hallow rectangle");
            int m=sc.nextInt();
            System.out.println("enter the no coloumns");
            int n=sc.nextInt();
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n && j<=i;j++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}