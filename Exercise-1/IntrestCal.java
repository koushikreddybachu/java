import java.util.*;
class IntrestCal
{
    public static void main(String a[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
        System.out.println("Enter the Principle amount");
        int p=sc.nextInt();
        System.out.println("Enter the Rate of Intrest");
        float r=sc.nextFloat();
        System.out.println("Enter Duration in year");
        int t=sc.nextInt();
        double si,ci;
        si=(p*t*r)/100;
        ci=p*Math.pow(1+(r/100),t)-p;
        System.out.println("-------------------");
        System.out.println("simple intrest:"+si);
        System.out.println("Coumpound intrest:"+ci);
        System.out.println("-------------------");
        }
    }
}