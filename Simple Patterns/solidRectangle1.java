import java.util.Scanner;
class solidRectangle1
{
    public static void main(String a[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
        System.out.println("enter the no of rows in recangle pattern");
        int m=sc.nextInt();
        System.out.println("enter the no of coloumns");
        int n=sc.nextInt();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }
}