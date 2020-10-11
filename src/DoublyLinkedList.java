
class Node{
	int data;
	Node prev;
	Node next;
}
class Doubly{
	Node head;
	void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.prev = null;
		
		if(head == null) {
			head = node;
		}else {
			Node n = head;
			while(n.next!= null) {
				n = n.next;
			}
			n.next = node;
			node.prev = n;
			
		}
	}
	void show() {
		Node node = head;
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	// Add the node at the start of list
	void addNodeStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.prev = null;
		
		if(head == null) {
			head = node;
		}else {
			head.prev = node;
			node.next = head ;
			
			
		}
		
	}
}
public class DoublyLinkedList {
	public static void main(String[] args) {
		Doubly d = new Doubly();
		d.insert(1);
		d.insert(2);
		d.insert(3);
		d.addNodeStart(0);
		d.show();
	}
}
