class Book
{
    String BKName,BKAuthor;
    int BKid;
    Book(){}
    Book(String BKName,int BKid,String BKAuthor)
    {
        this.BKid=BKid;
        this.BKName=BKName;
        this.BKAuthor=BKAuthor;
    }
    void BKUpdateDetails(String name, int id, String author)
    {
        BKid=id;
        BKName=name;
        BKAuthor=author;
    }
    void BKDisplay()
    {
        System.out.println("---------------------------------");
        System.out.println("Book Id:"+BKid);
        System.out.println("Book Name:"+BKName);
        System.out.println("Author Name:"+BKAuthor);
        System.out.println("----------------------------------");
    }
}
public class BookDemo
{
    public static void main(String a[])
    {
        Book b1=new Book("Sakshi",3024,"Jagan Mohan");
        b1.BKDisplay();
        b1.BKUpdateDetails("Eenadu",3118,"baby boy");
        b1.BKDisplay();
    }
}