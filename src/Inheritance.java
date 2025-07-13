// The main idea of Inheritance to reuse code and things from other classes
//superclass is the main class (parent)
//subclass is the class that inherits from another class(child)
//res:w3schools, techtarget
public class Inheritance extends Abstraction{
    public Inheritance(){
        super(); //call the superclass consrtucter
        System.out.println("Inheritance class constructer");

    }
    public int calMul(){
        return getNum()*getNum2();

    }

    public int calDiv(){
        return getNum()/getNum2();
    }
}
