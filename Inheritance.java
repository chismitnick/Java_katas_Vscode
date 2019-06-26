

public class Parent {

    int x;
    int y;

    void showvalues() {
        System.out.println("The values of x and y are :" + x + "" + j)
    }
}

public class Child extends Parent {
    int z;

    void showz() {
        System.out.println("The value of z is :" + z)
    }
}


public class Inhertitance {

    Parent p = new Parent();
    Child  c = new Child();

    p.x = 10;
    p.y = 13;




}