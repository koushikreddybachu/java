class Point
{
    double x,y;
    Point()
    {
        x=0;
        y=0;
    }
    Point(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    Point(Point k)
    {
        x=k.x;
        y=k.y;
    }
    double find_distance(double x,double y)
    {
        double temp= Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
        return temp;
    }
    double find_distance(Point k)
    {
        double temp= Math.sqrt(Math.pow(x-k.x,2)+Math.pow(y-k.y,2));
        return temp;
    }
    void display()
    {
        System.out.println("("+x+","+y+")");
    }
}
public class PointDemo
{
    public static void main(String[] args) 
    {
        double d,d1;
        Point p1=new Point(3.25,7.89);
        Point p2=new Point(5.37,18.12);
        Point p3=new Point(p2);
        d=p1.find_distance(7.9,16.25);
        p1.display();
        System.out.println("\ndistance to p1 is:"+d);
        d1=p1.find_distance(p3);
        System.out.println("\ndistance between p1 and p2:"+d1);
    }
}