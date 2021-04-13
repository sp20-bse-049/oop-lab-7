
package lab.pkg7;


public class Act3_runner {
    public static void main(String[]args){
        Line L1 = new Line(3,5,6,7);
        Line L2 = new Line(2,8,5,9);
        Point L3 = new Point(L1,L2);
        L3.Display();
        
    }
    
}
