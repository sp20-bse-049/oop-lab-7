
package lab.pkg7;


public class Line {
    
        Point start;
        Point end;
        double x1;
        double x2;
        double y1;
        double y2;
        public Line( double c, double d, double e, double f){
           x1 = c;
           x2 = d;
           y1 = e;
           y2 = f;
        }
        public double legth(){
            double a = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1), 2));
            return a;
        }
    
}
