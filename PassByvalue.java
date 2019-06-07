/*
A simple Java Program to demonstrate what passing an argument to a subroutine 
using call by value method.This approach copies the value of an argument into the formal
parameter of the subroutine. Therefore, changes made to the parameter of the subroutine
have no effect on the argument
In Java passing a primitive type to a method passes it by value.
*/
class Original {
    void method(int x, int y) {
        x *= 6;
        y /= 6;
    }
}
class PassByvalue {
    public static void main(String[] args) {
        Original og = new Original();
       int  x = 12;
        int y = 30;
        // displays primitive values before the method call is invoked
        System.out.println("Values of  x and y before method call :" + x + " " + y);

        // Method invoked
        og.method(x, y);

        // displays primitive values after the method call is invoked

        System.out.println("Values of  x and y before method call :" + x + " " + y);
    }

}