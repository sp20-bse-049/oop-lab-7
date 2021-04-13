
package lab.pkg7;


public class Point {
    Line xcor;
    Line ycor;
    double count;
    public Point(Line a,Line b){
        xcor = a;
        count ++;
        ycor = b;
        count++;
        
    }
    public Point (Line a ){
        xcor = a;
        count++;
    }

    public void setXcor(Line a){
        xcor = a;
    } 
    public Line getXcor(){
        return xcor;
    }
     public void setYcor(Line b){
        ycor = b;
    } 
    public Line getYcor(){
        return ycor;
    }
    public void Display(){
        if(count == 2){
        System.out.println("Length of the first line is "+ xcor.legth() +" and lenght of the second line is  " + ycor.legth());
        }
        else{
            System.out.println("Lenght of the line  is " + xcor.legth());
    }
    }   
}
