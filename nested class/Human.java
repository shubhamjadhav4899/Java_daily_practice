class Human{
    void eat(){
        System.out.println("eats fruits");
    }
    void speak(){
        System.out.println("speaks English");
    }
    public static void main(String[] args) {
    // AIS
    Human h = new Human(){
        @Override
        void eat(){
        System.out.println("eats veggies");
        }
        @Override
        void speak(){
        System.out.println("speaks Hindi");
        }
    };
    h.eat();
    h.speak();    
}
}
/*

from CDAC Hyderabad to everyone:    5:31 PM
abstract class Human{
    abstract void eat();
    abstract void speak();
    public static void main(String[] args) {
    // AIS
    Human h = new Human(){
        
        void eat(){
        System.out.println("eats fruits");
        }
        
        void speak(){
        System.out.println("speaks Hindi");
        }
    };
    h.eat();
    h.speak();    
}
}


from CDAC Hyderabad to everyone:    5:38 PM
public class Outer{
private int data = 100;
// member class
    class Inner{
        void msg(){
            System.out.println("The outer class data is: "+data);
        }
    }
void display(){
    Inner in = new Inner(); 
    in.msg();
}
    public static void main(String[] args) {
        
        Outer out = new Outer();
        out.display();
    }
}
*/