
package lab.pkg7;

public class PizzaOrder {
    Pizza p1;
    Pizza p2;
    Pizza p3;
    int count = 0;

    public PizzaOrder(Pizza p1, Pizza p2, Pizza p3) {
        this.p1 = p1;
        count++;
        this.p2 = p2;
        count++;
        this.p3 = p3;
        count++;
        
        System.out.println(p1.getDiscription());
        System.out.println(p2.getDiscription());
        System.out.println(p3.getDiscription());
    }

    public PizzaOrder(Pizza p1, Pizza p2) {
        this.p1 = p1;
        count++;
        this.p2 = p2;
        count++;
        
        System.out.println(p1.getDiscription());
        System.out.println(p2.getDiscription());
    }

    public PizzaOrder(Pizza p1) {
        this.p1 = p1;
        count++;
        System.out.println(p1.getDiscription());
    }
    
    
      
    public void Calctotal(){
        if(count==3){
            System.out.println("your total bill is "+(p1.calCost() + p2.calCost() + p3.calCost()) + "$");
        }
        else if(count == 2){
            System.out.println("your total bill is " + (p1.calCost() + p2.calCost()) + "$");
        }
        else{
            System.out.println("your total bill is " + p1.calCost() + "$");
        }
            
    }
    
}
