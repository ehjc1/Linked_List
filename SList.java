 /*A blueprint that holds all essential functions to create a linked list object.
 Where each item stores its own values as well as the address/location
 of its neighbour.*/
public class SList {
    /*Creates a SNode object that stores the value as well as the position/location
    of the next/neighbouring node.*/
    public class SNode {

        public String key;
        public SNode next;

//      The constructor for SNode
        public SNode(String key) {
            this.key = key;
        }

//      Prints out the key/value to screen
        public void display() {
            System.out.println(key);
        }
    }

    SNode head;
    SNode index;

//  A method that adds the string that is passed into the method, onto the list
    public void add(String s) {

//      Check if we are initialising the list
        if (head == null) {
            head = new SNode(s);
        }
        else {
            SNode newNode = new SNode(s);

            newNode.next = head;
            head = newNode;
        }
    }

//  A method that checks if the String that is passed in, already exists in the list
    public boolean has(String s) {

        boolean hasString = false;
        index = head;

//      While there is still a node to point to
        while (index != null) {
            if (index.key == s) {
                hasString = true;
                break;
            }
            index = index.next;
        }

        index = null;
        return hasString;
    }

//  A method that removes an item from the list based on the String value that was passed in
    public void remove(String s) {

        SNode previous = null;
        index = head;

//      While there is still items in the list
        while (index != null) {

//          Checks if the current node is equal to the desired value
            if (index.key == s) {

                if(previous == null) {
                    head = head.next;
                }
                else {
                    previous.next = index.next;
                }
                break;
            }
//          Continue looping
            else {
                previous = index;
                index = index.next;
            }
        }
    }

//  A method that returns the length of the list
    public int length() {

        int count = 0;
        index = head;

//      increments counter while there are still items to read
        while (index != null) {
            count++;
            index = index.next;
        }

        return count;
    }

//  A method that checks if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

//  A method that writes the value of each item in the list onto the terminal(screen)
    public void dump() {
        index = head;

//      Loops through the list and display every item
        while (index != null) {
            index.display();
            index = index.next;
        }
    }
}


