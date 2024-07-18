import java.util.*;
class OddEven
{
    public static void main(String a[])
    {
        Scanner open=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=open.nextInt();
        if(n%2==0)
        System.out.println("Given number is Even");
        else
        System.out.println("Give number is Odd");
    }
}