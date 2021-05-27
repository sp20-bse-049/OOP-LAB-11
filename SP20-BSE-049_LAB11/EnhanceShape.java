
package lab.pkg11;


interface shape{
    double Perimeter();
    
}
interface EnhanceShape extends shape{
    double Perimeter();
    int abc();
    
}
class Geo implements EnhanceShape{
    double a;
    int c;

    public Geo(double a,int b) {
        this.a = a;
        this.c = b;
    }
    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
     public int abc(){
        return c; 
     }
     public double Perimeter(){
         return a;
     }
     public void Display(){
        System.out.println("perimeter is "+Perimeter());
        System.out.println("value of abc is "+abc());
         
     }
    
    
}

