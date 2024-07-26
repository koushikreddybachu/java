class Mobilephone
{
    double ModelNo,cost,size,memoryCapacity,cameraPixels;
    String manufacturerName,color;
    Mobilephone()
    {
        System.out.println("\n*****Called default costructor*****\n");
    }
    Mobilephone(double c,double msize)
    {
        System.out.println("\n*****Called Two Argument Constructor*****\n");
        cost=c;
        memoryCapacity=msize;
    }
    Mobilephone(double cost,double size,String color)
    {
        System.out.println("\n*****Called Three Argument Constructor*****\n");
        this.cost=cost;
        this.size=size;
        this.color=color;
    }
    Mobilephone(double ModelNo,double cameraPixels,double msize,String manufacturerName)
    {
        System.out.println("\n*****Called Four Argument Constructor*****\n");
        this.ModelNo=ModelNo;
        this.cameraPixels=cameraPixels;
        memoryCapacity=msize;
        this.manufacturerName=manufacturerName;
    }
    void display()
    {
        System.out.println("-------------------------");
        System.out.println("Model number:"+ModelNo);
        System.out.println("Manufacturer Name:"+manufacturerName);
        System.out.println("Cost of Mobile:"+cost+"IND Rs");
        System.out.println("Mobile Size:"+size+"inches");
        System.out.println("Colour:"+color);
        System.out.println("Memory Capacity:"+memoryCapacity+"GB");
        System.out.println("Camera Pixels:"+cameraPixels+"Mega Pixels");
        System.out.println("-------------------------");
    }
}
public class MobilephoneDemo
{
    public static void main(String a[])
    {
        Mobilephone m=new Mobilephone(98999,16);
        m.display();
        Mobilephone m1=new Mobilephone(98999,14,"Black");
        m1.display();
        Mobilephone m2=new Mobilephone(124865,100,8,"Apple");
        m2.display();
    }
}