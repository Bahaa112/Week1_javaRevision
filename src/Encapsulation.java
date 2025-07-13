//the main idea of Encapsulation is hiding the implementation part and show the functionality
/*But why? it give a better management for the code and it easier to use and handle it */
//res : GeeksforGeeks , techtarget
public class Encapsulation {

    private int num; //private variables
    private int num2;

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num=num;
    }

    public int getNum2(){
        return num2;
    }

    public void setNum2(int num2){
        this.num2=num2;
    }

    //public methods
    public int getCalMul(){
        return num2*num;

    }



}
