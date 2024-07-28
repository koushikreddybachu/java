import java.util.*;
public class numbersHalfpyramid
{
    public static void main(String a[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter no of rows");
            int m=sc.nextInt();
            System.out.println("enter the no coloumns");
            int n=sc.nextInt();
            for(int i=0;i<m;i++)
            {
                int k=1;
                for(int j=0;j<n && j<=i;j++)
                {
                    System.out.print(k);
                    k++;
                }
                System.out.println();
            }
        }
    }
}