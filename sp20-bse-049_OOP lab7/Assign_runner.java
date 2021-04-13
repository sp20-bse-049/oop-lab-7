
package lab.pkg7;

public class Assign_runner {
    public static void main(String[]args){
        Pizza piz1 = new Pizza("medium", 1 , 3 , 4 );
        Pizza piz2 = new Pizza("small", 6 , 2 , 3 );
        PizzaOrder p = new PizzaOrder(piz1,piz2);
        p.Calctotal(); 
    }
    
}
