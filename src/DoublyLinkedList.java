
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
	// Insert node at given position of list
	void addPosition(int pos, int data) {
		Node node = new Node();
		node.data = data;
		int position =0;
		Node n = head;
		while(n.next!= null) {
			if(pos == position) {
				Node temp = n.next;
				n.next = node;
				node.prev = n;
				node.next = temp;
				
			}
			n = n.next;
			position +=1;
		}
	}
	// Delete the First Node of Doubly Linked List
	void deleteFirstNode() {
		Node node = head;
		
			
			Node temp = node.next;
			node = null;
			temp.next.prev = null;
			head = temp;
			
		
	}
	// Delete a node from doubly linked list
	void deleteNode(int data) {
		Node node = new Node();
		node.data = data;
		/*1
		2
		3
		4
		5
		6*/
		Node n = head;
		while(n.next != null) {
			if(n.next.data == node.data) {
				//System.out.println("Found the number...");
				n.next = n.next.next;
				n.next.prev = n;
			}
			n = n.next;
		}
		//System.out.println("didn't find the no. Try again");
	}
	
}
public class DoublyLinkedList {
	public static void main(String[] args) {
		Doubly d = new Doubly();
		d.insert(1);
		d.insert(2);
		d.insert(3);
		d.insert(4);
		d.insert(5);
		d.insert(6);
		//d.addNodeStart(0);
		//d.addPosition(2, 100);
		//d.deleteFirstNode();
		d.deleteNode(3);
		d.show();
	}
}
