public class HelloWorld {

public static void main(String[]args) {
/** Prints Display message */
System.out.println("This Java proogram displays the function of Java Arrays");


/**Declare a variable of type int */
int month_days[];

month_days = new int[12];
month_days[0] = 31;
month_days[1] = 28;
month_days[2] = 31;
month_days[3] = 30;
month_days[4] = 31;
month_days[5] = 30;
month_days[6] = 31;

month_days[7] = 31;
month_days[8] = 30;
month_days[9] = 31;
month_days[10] = 30;
month_days[11] = 31;

/** Print number of days for each month  */

System.out.println("January has " + month_days[0] + " days.");
System.out.println("February has " + month_days[1] + " days.");
System.out.println("March has " + month_days[2] + " days.");
System.out.println("April has " + month_days[3] + " days.");
System.out.println("May has " + month_days[4] + " days.");
System.out.println("June has " + month_days[5] + " days.");
System.out.println("July has " + month_days[6] + " days.");
System.out.println("August has " + month_days[7] + " days.");
System.out.println("September has " + month_days[8] + " days.");
System.out.println("October has " + month_days[9] + " days.");
System.out.println("November has " + month_days[10] + " days.");
System.out.println("December has " + month_days[11] + " days.");


}
}
