
/**
 * Write a description of class TestMyList here.
 *
 * @author Brendan
 * @version 1/31/11
 */
import java.util.Scanner;

public class TestMyList {

    private static double one;
    private static double two;
    private static double three;
    private static Scanner console;

    public static void main(String[] args) {
        int nodes = 0;
        console = new Scanner(System.in);
        MyList myList = new MyList();
        System.out.println("Please enter number of nodes.");
        nodes = console.nextInt();
        myList.newRandomList(nodes);

        System.out.println("printing list...");
        myList.printList();
        
        System.out.println("Average = " + myList.getAverage());
        System.out.println("Max = " + myList.getMax());
        System.out.println("Min = " + myList.getMin());
        System.out.println("Standard Deviation = " + myList.getStandardDeviation());
    }
}
