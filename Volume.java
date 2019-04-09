

//Calculates the Volume of a given Box based on predefined parameters

import Java.lang.*;

    
class Box {
    double width;
    double height;
    double depth;
    
    // This class declares an object of type Box.

    public static void main(String args[]) {
    Box mybox = new Box();
    double vol;
    // assign values to mybox's instance variables
    mybox.width = 10;
    mybox.height = 20;
    mybox.depth = 15;
    // compute volume of box
    vol = mybox.width * mybox.height * mybox.depth;
    System.out.println("Volume is " + vol);
    }
    }