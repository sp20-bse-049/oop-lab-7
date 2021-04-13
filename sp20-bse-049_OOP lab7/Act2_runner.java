
package lab.pkg7;


public class Act2_runner {
     public static void main(String[]args){
        Address r = new Address(2 , 36 , "islamabad" , 321);
        Person i = new Person("Isac ","Newton ",45,r);
        Book b1 = new Book("urdu","ghalib",i);
        b1.Display();
    }
    
}
