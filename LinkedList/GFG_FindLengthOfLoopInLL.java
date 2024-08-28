
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

// Function should return the length of the loop in LL.

class GFG_FindLengthOfLoopInLL {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node slow = head;
        Node fast = head;
        int loopLength = 0;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast = fast.next.next;
            if(slow == fast){
                do {
                    fast = fast.next;
                    loopLength++;
                } while (fast != slow);
                return loopLength;
            }
        }
        return 0;
        
    }
}