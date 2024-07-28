import java.util.*;
public class invertedHalfpyramid
{
    public static void main(String a[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter no of rows");
            int m=sc.nextInt();
            System.out.println("enter the no coloumns");
            int n=sc.nextInt();
            for(int i=m-1;i>=0;i--)
            {
                for(int j=0;j<=i && j<n;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}