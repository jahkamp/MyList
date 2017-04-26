
/**
 * Write a description of class ListNode here.
 *
 * @author Brendan
 * @version 1/31/11
 */
public class ListNode {
    private double data;
    private ListNode next;

    /**
     * Constructor for objects of class ListNode
     */
    public ListNode(double data) {
        // initialise instance variables
        this.data = data;
        next = null;
    }

    public double getData() {
        return data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
