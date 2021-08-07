package code.lesson2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //declare array of integers;
        int intArray[];
        //allocating a memory of 10 integers;
        intArray = new int[10];
        //initialize the first elements of the array
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;
        intArray[5] = 60;
        intArray[6] = 70;
        intArray[7] = 80;
        intArray[8] = 90;
        intArray[9] = 100;

        //access elements of the specified array
        for (int i=0; i<intArray.length; i++)
            System.out.println("Element at index" + i + " : "+intArray[i]);


    }
}
