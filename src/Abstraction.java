//The main idea of Abstraction is hiding the implementation details for some methods and show only details for important methods
//The methods who don't have the implementation the subclass must has the implementation
//res: techtarget , w3schools , geeksforgeeks
abstract class Abstraction {

    public Abstraction(){
        System.out.println("Abstraction class constructer");
    }

    private int num;
    private int num2;

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num=num;
    }

    public int getNum2(){  //method with details
        return num2;
    }

    public void setNum2(int num2){
        this.num2=num2;
    }
    abstract int calMul();  //abstract method
    abstract int calDiv(); //abstract method

}
