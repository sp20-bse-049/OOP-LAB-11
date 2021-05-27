
package lab.pkg11;


public interface Car  {
    short Wheels();
    
}
interface Auto {
    double Wheels();
    
}
interface Bicycle {
    int Wheels();
    
}
class vehicle implements Car{
    int a ;
    short b;
    double c;
    public vehicle(int a) {
        this.a = a;
    }
    //public int Wheels(){
    //    return a;    
    //}
     public short Wheels(){
        return b;    
    }
      //public double Wheels(){
       // return c;    
    //}
    public void Display(){
        System.out.println("Wheels are "+ Wheels());
    }    
}

