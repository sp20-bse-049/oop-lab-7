
package lab.pkg7;


public class Pizza {
    
    private String size;
    private int cheesetop;
    private int peptop;
    private int hemtop;
    private double costtopping;

    public Pizza(String size, int cheesetop, int peptop, int hemtop) {
        this.size = size;
        this.cheesetop = cheesetop;
        this.peptop = peptop;
        this.hemtop = hemtop;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCheesetop(int cheesetop) {
        this.cheesetop = cheesetop;
    }

    public void setPeptop(int peptop) {
        this.peptop = peptop;
    }

    public void setHemtop(int hemtop) {
        this.hemtop = hemtop;
    }

    public void setCosttopping(double costtopping) {
        this.costtopping = costtopping;
    }
    
    
    public String getSize() {
        return size;
    }

    public int getCheesetop() {
        return cheesetop;
    }

    public int getPeptop() {
        return peptop;
    }

    public int getHemtop() {
        return hemtop;
    }
    
    
    public double calCost(){
        costtopping = cheesetop+peptop+hemtop;
        double cost;
        if(size=="small"){
            cost = 10+2*costtopping;
        }
        else if(size=="medium"){
            cost = 12+2*costtopping;
        }
        else{
            cost = 14+2*costtopping;
        }
        return cost;
    }
    
    // method to tell about pizza size......
    public boolean getDiscription(){
        System.out.println("Hello sir, you oddered "+ getSize()+" sized pizza " + " with " + cheesetop +" Cheese toppings , " + peptop + "  pepperoni toppings and with " + hemtop + "  ham toppings " +"\n your bill for this pizza is " + calCost() + "$");
        
        return true;
    }
    
}
