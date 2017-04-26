
import java.util.Random;

/**
 * Write a description of class MyList here.
 *
 * @author Brendan
 * @version 1/31/11
 */
public class MyList {

    // instance variables - replace the example below with your own
    private Random randy;
    private ListNode head;

    /**
     * Constructor for objects of class MyList
     */
    public MyList() {
        // initialise instance variables
        randy = new Random();
        head = null;
    }

    public MyList newRandomList(int n) {
        MyList randomList = new MyList();
        for (int i = 0; i < n; i++) {
            randomList.insertAtEnd(new ListNode(randy.nextInt()));
        }
        return randomList;
    }

    public double getAverage() {
        ListNode currentNode = head;
        double average = 0;
        int counter = 0;
        while (currentNode != null) {
            counter++;
            average += currentNode.getData();
            currentNode = currentNode.getNext();
        }
        average /= counter;
        return average;
    }

    public double getMax() {
        ListNode currentNode = head;
        double max = 0;
        while (currentNode != null) {
            if(max < currentNode.getData())
                max = currentNode.getData();
            currentNode = currentNode.getNext();
        }
        return max;
    }

    public double getMin() {
        ListNode currentNode = head;
        double min = 0;
        while (currentNode != null) {
            if(min > currentNode.getData())
                min = currentNode.getData();
            currentNode = currentNode.getNext();
        }       
        return min;
    }

    public double getStandardDeviation() {
        ListNode currentNode = head;
        double average = 0;
        double max = 0;
        double min = 0;
        double standardDeviation = 0;
        int counter = 0;
        while (currentNode != null) {
            counter++;
            if(min > currentNode.getData())
                min = currentNode.getData();            
            if(max < currentNode.getData())
                max = currentNode.getData();
            average += currentNode.getData();
            currentNode = currentNode.getNext();
        }        
        average /= counter;
        if(average - min > max - average)
            standardDeviation = average - min;
        else
            standardDeviation = max - average;
        return standardDeviation;
    }

    public void insertAtEnd(ListNode node) {
        if (head == null) {
            head = node;
            return;
        }
        // otherwise the list is non-empty:
        ListNode currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        // at this point currentNode points to the last element in the list.
        currentNode.setNext(node);

    }

    public void printList() {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();                     
        }
        
    }

}
