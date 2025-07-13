public class Main {
    public static void main(String[] args) {

        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setNum(3);
        encapsulation.setNum2(5);
        System.out.println("encapsulation class:"+encapsulation.getCalMul());

        Abstraction abstractionAndInheritance = new Inheritance();
        abstractionAndInheritance.setNum(20);
        abstractionAndInheritance.setNum2(10);
        System.out.println("abstraction and inheritance classes:"+abstractionAndInheritance.calDiv());
        System.out.println("abstraction and inheritance classes:"+abstractionAndInheritance.calMul());

        Inheritance inheritance = new Inheritance();

        FunctionalInterface functionalInterface = new FunctionalInterface() {
            @Override
            public void show() {
                System.out.println("Functional Interface");
            }
        };
        functionalInterface.show();

        FunctionalInterface2 functionalInterface2 = () -> System.out.println("hi");

        functionalInterface2.hi();

        FunctionalInterface3 functionalInterface3 = (x,y) -> x+y;
        int res = functionalInterface3.add(10,4);
        System.out.println(res);

        System.out.println("Test for github");




    }
}