public class AccessModifiers {

    int num;  //default access modifier only classes in the same package can access it
    private int num2; //private access modifier only it can use in the same class , can't use it in any other classes or packages
    protected int num3; //protected access modifier it can access in classes in the same package or as a subclass in different packages
    public int num4; //public it can access everywhere
}
