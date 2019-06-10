/* 
A simple program to print n numbers of an array using recursive method
*/



class RecursionTest {
int values[];

RecursionTest(int i){
    values = new int[i];
} 
void DisplayValues(int i){
    if( i==0)
    return ;
    else DisplayValues(i -1);
    System.out.println("[" +(i-1)+ "]" + values[ i-1]);
}

}

class Recursion2 {


public static void main(String[] args) {
    RecursionTest ob  = new RecursionTest(10);
int i;

for(i=0;i<10;i++) ob.values[i]=i;
ob.DisplayValues(10);

}



}


