package LinkedList.copy;

/**
 * Q. How to reverse a single linked list?
 *
 */
public class LinkedList {
	Node head;
	
	Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = head;
        while (curr != null) {
            next = curr.nextNodeRef; //step1
            curr.nextNodeRef = prev; //step2
            prev = curr; //step3
            curr = next; //step4
        }
        head = prev;
        return head;
    }
	
	void addNode(Node newNode) {
		if(head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.nextNodeRef != null) {
			temp = temp.nextNodeRef;
		}
		temp.nextNodeRef = newNode;
	}
 
    void traverseAndPrint(Node head) {
    		System.out.println("Elements in the LinkedList:");
    		while(head != null) {
    			System.out.println(head.value);
    			head = head.nextNodeRef;
    		}
    }
    
    public static void main(String[] args) {
    		LinkedList list = new LinkedList();
    		list.addNode(new Node(10));
    		list.addNode(new Node(20));
    		list.addNode(new Node(30));
    		list.addNode(new Node(40));
    		
    		list.traverseAndPrint(list.head);
    		
    		list.traverseAndPrint(list.reverse(list.head));
    }
}
