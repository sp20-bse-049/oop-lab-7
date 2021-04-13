
package lab.pkg7;


public class Book {
    private String Bookname;
    private String Publisher;
    private Person author;

    public Book(String Bookname, String Publisher, Person author) {
        this.Bookname = Bookname;
        this.Publisher = Publisher;
        this.author = author;
    }
    
     public void setBookname(String b){
        Bookname = b;
    }
    public String getBookname(){
        return Bookname;
    }
     public void setPublisher(String p){
        Publisher = p;
    }
    public String getPublisher(){
        return Publisher;
    }
    public void Display(){
        System.out.println(author.Display());
        System.out.println("Book name is " + Bookname +" and it is published by  "+Publisher);
    }
    
    
}
