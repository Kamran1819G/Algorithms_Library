package pratice_coding;

public class SinglyLinkedList {
	public class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	Node tail = null;
	
	public void insertnode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		while(current != null) {
			System.out.println(current.data +" ");
			current = current.next;
		}
	}
	
	public void deletenode(int key) {
		Node current = head;
		Node previous = null;
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		if(current != null && current.data == key) {
			head = current.next;
		}
		while(current != null && current.data != key) {
			previous = current;
			current = current.next;
		}
		previous.next = current.next;
	}
	
	public static void main(String[] args) {
		SinglyLinkedList node = new SinglyLinkedList();
		node.insertnode(5);
		node.insertnode(4);
		node.insertnode(7);
		node.display();
		node.deletenode(4);
		node.display();
	}
}

