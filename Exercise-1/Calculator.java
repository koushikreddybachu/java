
import java.util.*;

class Calculator 
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        float z=0;
        for(int n=0;n<=4;)
        {
            System.out.println("---------------------------------");
            System.out.println("Select the operation");
            System.out.println("1. Addition");
            System.out.println("2. Difference");
            System.out.println("3. Product");
            System.out.println("4. Division");
            System.out.println("5.Exit");
            System.out.println("---------------------------------");
            n=sc.nextInt();
            if(n==5)
            {
                System.out.println("Exited");
                break;
            }
            System.out.println("Enter the two numbers");
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(n==1)
            z=x+y;
            if(n==2)
            z=x-y;
            if(n==3)
            z=x*y;
            if(n==4)
            z=x/y;
            System.out.println("----------");
            System.out.println("Result="+z);
            System.out.println("----------");
        }
    }
}
