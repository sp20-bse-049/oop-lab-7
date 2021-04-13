
package lab.pkg7;


public class Act1_runner {
    public static void main(String[]args){
        Address a = new Address(5 , 13 , "khushab" , 453);
        a.setCity("faisalabad");
        Person p = new Person("Muhammad ","farhan",20,a);
        p.Display();
    }
    
}
