
package lab.pkg7;


public class Person {
    private String Fname;
    private String Lname;
    private int age;
    private Address adr;
    public Person(String F,String L, int A, Address adres){
        Fname = F;
        Lname = L;
        age = A;
        adr = adres;
        }
    public void setFirstname(String f){
        Fname = f;
    }
    public String getFirstname(){
        return Fname;
    }
     public void setLastname(String l){
        Lname = l;
    }
    public String getLastname(){
        return Lname;
    }
     public void setAge(int a){
        age = a;
    }
    public int getage(){
        return age;
    }
    public boolean Display(){
        System.out.println("person name is " + Fname+Lname+" and his age is " + age);
        System.out.println("Person address is given below ");
        System.out.println("City name "+adr.getcity());
        System.out.println( "Street number "+adr.getStreet());
        System.out.println( "House number "+adr.getHouse());
        System.out.println("City code is " + adr.getCode());
        return true;
    }

   
  
    
}
